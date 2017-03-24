package org.ipl.fun.repository;

import org.ipl.fun.model.Prediction;
import org.ipl.fun.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Prediction", path = "Prediction")
public interface PeoplePredictionRepository extends PagingAndSortingRepository<Prediction, Long> {



}