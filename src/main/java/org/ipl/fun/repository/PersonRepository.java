package org.ipl.fun.repository;

import java.util.List;

import org.ipl.fun.model.People;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<People, Long> {

//    List<People> findByLastName(@Param("name") String name);

}