package com.rockettest1.control.services;

import java.util.List;

import com.rockettest1.control.models.CanvasjsChartData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CanvasjsChartServiceImpl implements CanvasjsChartService {

    @Autowired
    private CanvasjsChartDao canvasjsChartDao;

    public void setCanvasjsChartDao(CanvasjsChartDao canvasjsChartDao) {
        this.canvasjsChartDao = canvasjsChartDao;
    }

    @Override
    public List<List<CanvasjsChartData.DataPointModel>> getCanvasjsChartData() {
        return canvasjsChartDao.getCanvasjsChartData();
    }

}
