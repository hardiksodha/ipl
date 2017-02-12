package org.ipl.fun.repository;

import org.ipl.fun.model.People;
import org.ipl.fun.model.Schedule;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "schedule", path = "schedule")
public interface ScheduleRepository extends PagingAndSortingRepository<Schedule, Long> {

//    List<People> findByMatchId(@Param("matchId") long matchId);

}