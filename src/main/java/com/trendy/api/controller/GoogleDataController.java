package com.trendy.api.controller;

import com.trendy.api.client.GoogleDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

// mark this class as a controller to handle /demo requests
@RestController
@RequestMapping(value = "/google")
public class GoogleDataController {

    @Autowired
    GoogleDataClient googleDataClient;

    @GetMapping(value = "/hourly")
    public String getHourlyData() throws IOException {
        return googleDataClient.getHourlyData();
    }

}