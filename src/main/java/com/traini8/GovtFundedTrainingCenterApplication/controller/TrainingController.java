package com.traini8.GovtFundedTrainingCenterApplication.controller;


import com.traini8.GovtFundedTrainingCenterApplication.exception.DataNotFound;
import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenter;
import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenterModel;
import com.traini8.GovtFundedTrainingCenterApplication.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/trainingcenter")
public class TrainingController {


    private TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @RequestMapping("/hello")
    public String print() {
        return "heelo";
    }

    @PostMapping
    public ResponseEntity<?> addTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        TrainingCenterModel trainingCenterModel1 = trainingService.addTrainingCenter(trainingCenter);
        return new ResponseEntity<>(trainingCenterModel1, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getTrainingCenter() throws DataNotFound {
        return new ResponseEntity<>(trainingService.getTrainingCenter(), HttpStatus.OK);
    }


}

