package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "PeoplePrediction", path = "PeoplePrediction")
public interface PeoplePredictionRepository extends PagingAndSortingRepository<People, Long> {



}