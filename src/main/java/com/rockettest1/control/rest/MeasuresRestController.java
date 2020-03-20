package com.rockettest1.control.rest;

import com.rockettest1.control.models.Measures;
import com.rockettest1.control.repositories.MeasuresRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;



// Can be tested with POSTMAN for REST API
@RestController
@RequestMapping("/api/v1/measures")
public class MeasuresRestController {
        @Autowired
        private MeasuresRepository measuresRepository;

        @GetMapping("/measures")
        public List<Measures> list(){
            return measuresRepository.findAll();
        }


        @GetMapping("/measures/{id}")
        public String get(ModelAndView model, @PathVariable Long id){
            Measures measures = measuresRepository.getOne(id);
            model.addObject("measures", measures);
            return "measures";
        }


        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Measures create(@RequestBody final Measures measures){
            return measuresRepository.saveAndFlush(measures);
        }

        @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable Long id) {
            //Check for children records
            measuresRepository.deleteById(id);
        }


        @RequestMapping(value = "{id}", method = RequestMethod.PUT)
        public Measures update(@PathVariable Long id, @RequestBody Measures measures) {

            Measures existingMeasures = measuresRepository.getOne(id);
            BeanUtils.copyProperties(measures, existingMeasures, "id");
            return measuresRepository.saveAndFlush(existingMeasures);
        }

}






