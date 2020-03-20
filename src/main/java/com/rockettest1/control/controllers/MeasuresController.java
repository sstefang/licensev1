package com.rockettest1.control.controllers;


import com.rockettest1.control.models.Measures;
import com.rockettest1.control.repositories.MeasuresRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class MeasuresController {

    @Autowired
    private MeasuresRepository measuresRepository;

    @GetMapping("/measures")
    public String get(ModelAndView model){
        return "measures";
    }

    @GetMapping("/dashboard")
    public String getDashboard(ModelAndView model){

        return "dashboard";
    }


}
