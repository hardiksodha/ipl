package org.ipl.fun.repository;

import org.ipl.fun.model.Schedule;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "schedule", path = "schedule")
public interface ScheduleRepository extends PagingAndSortingRepository<Schedule, Long> {

//    List<User> findByMatchId(@Param("matchId") long matchId);

}