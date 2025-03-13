package com.traini8.GovtFundedTrainingCenterApplication.repo;

import com.traini8.GovtFundedTrainingCenterApplication.model.TrainingCenterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepo extends JpaRepository<TrainingCenterModel, Integer> {

}
