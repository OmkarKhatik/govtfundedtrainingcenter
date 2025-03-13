package com.traini8.GovtFundedTrainingCenterApplication.service;

import com.traini8.GovtFundedTrainingCenterApplication.exception.DataNotFound;
import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenter;
import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenterModel;
import com.traini8.GovtFundedTrainingCenterApplication.repo.TrainingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Component
public class TrainingService {

    @Autowired
    private TrainingRepo trainingRepo;

    @Autowired
    private TrainingCenterMapper mapper;

    public TrainingCenterModel addTrainingCenter(TrainingCenter trainingCenter) {
        TrainingCenterModel trainingCenterModel = mapper.map(trainingCenter);
        return trainingRepo.save(trainingCenterModel);
    }

    public List<TrainingCenter> getTrainingCenter() throws DataNotFound {
        List<TrainingCenterModel> models = trainingRepo.findAll();

        if(models == null || models.isEmpty()) {
            throw new DataNotFound("Data Not Found");
        }
        List<TrainingCenter> tcs = new ArrayList<>();
        for (TrainingCenterModel model : models) {
            tcs.add(mapper.map(model));
        }
        return tcs;
    }
}
