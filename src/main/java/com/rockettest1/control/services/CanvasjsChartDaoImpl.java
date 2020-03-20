package com.rockettest1.control.services;

//CanvasjsChartDaoImpl.java


import java.util.List;
import com.rockettest1.control.models.CanvasjsChartData;
import org.springframework.stereotype.Service;

@Service
public class CanvasjsChartDaoImpl implements CanvasjsChartDao {

    @Override
    public List<List<CanvasjsChartData.DataPointModel>> getCanvasjsChartData() {
        return CanvasjsChartData.getCanvasjsDataList();
    }

}