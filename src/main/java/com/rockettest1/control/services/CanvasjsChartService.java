package com.rockettest1.control.services;


import com.rockettest1.control.models.CanvasjsChartData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CanvasjsChartService {

    List<List<CanvasjsChartData.DataPointModel>> getCanvasjsChartData();

}
