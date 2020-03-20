package com.rockettest1.control.controllers;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.rockettest1.control.models.Data;
import com.rockettest1.control.repositories.DataDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChartController {


    @Autowired
    public DataDAO dataDAO;

    @RequestMapping("/index")
    public String showHome(){
        return "index";
    }

    @RequestMapping("/linechartdata")
    @ResponseBody
    public String getDataFromDB() {
        List<Data> datalist = dataDAO.findAll();
        JsonArray jsonTime = new JsonArray();
        JsonArray jsonTemp = new JsonArray();
        JsonObject json = new JsonObject();
        datalist.forEach(data -> {
            jsonTime.add(data.getTime());
            jsonTemp.add(data.getTemperature());
        });
        json.add("time", jsonTime);
        json.add("temperature", jsonTemp);
        return json.toString();
    }
}
