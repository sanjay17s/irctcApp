package org.example.entities;

import java.util.List;
import java.sql.Time;
import java.util.Map;


public class Train {

    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String,String> stationTimes;
    private List<String> stations;

}
