package com.traini8.GovtFundedTrainingCenterApplication.service;

import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenter;
import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenterModel;
import com.traini8.GovtFundedTrainingCenterApplication.repo.TrainingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Component
public class TrainingCenterMapper {

    public TrainingCenterModel map(TrainingCenter trainingCenter) {

        TrainingCenterModel tc = new TrainingCenterModel();
        tc.setCenterCode(trainingCenter.getCenterCode());
        tc.setCenterName(trainingCenter.getCenterName());
        tc.setAddress(trainingCenter.getAddress());
        tc.setContactEmail(trainingCenter.getContactEmail());
        tc.setContactPhone(trainingCenter.getContactPhone());
        tc.setCreatedOn(trainingCenter.getCreatedOn());
        tc.setStudentCapacity(trainingCenter.getStudentCapacity());
        String courcesOffrred = String.join("|", trainingCenter.getCourseOffered());
        tc.setCourseOffered(courcesOffrred);

        return tc;
    }

    public TrainingCenter map(TrainingCenterModel model) {

        TrainingCenter tc = new TrainingCenter();
        tc.setCenterCode(model.getCenterCode());
        tc.setCenterName(model.getCenterName());
        tc.setAddress(model.getAddress());
        tc.setContactEmail(model.getContactEmail());
        tc.setContactPhone(model.getContactPhone());
        tc.setCreatedOn(model.getCreatedOn());
        tc.setStudentCapacity(model.getStudentCapacity());
        if (model.getCourseOffered() != null) {
            List<String> courcesOffrred = Arrays.asList(model.getCourseOffered().split("|"));
            tc.setCourseOffered(courcesOffrred);
        }
        return tc;
    }

}
