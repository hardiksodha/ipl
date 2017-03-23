package org.ipl.fun.repository;

import org.ipl.fun.model.People;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Prediction", path = "Prediction")
public interface PeoplePredictionRepository extends PagingAndSortingRepository<People, Long> {



}