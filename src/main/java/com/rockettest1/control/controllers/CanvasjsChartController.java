package com.rockettest1.control.controllers;

import java.util.List;

import com.rockettest1.control.models.CanvasjsChartData;
import com.rockettest1.control.services.CanvasjsChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/canvas")
public class CanvasjsChartController {

    @Autowired
    private CanvasjsChartService canvasjsChartService;

    @GetMapping("/chart")
    public String springMVC(ModelMap modelMap) {
        List<List<CanvasjsChartData.DataPointModel>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart";
    }

    @ExceptionHandler({CanvasjsChartData.DatabaseConnectionException.class})
    public ModelAndView getSuperheroesUnavailable(CanvasjsChartData.DatabaseConnectionException ex) {
        return new ModelAndView("chart", "error", ex.getMessage());
    }
}
