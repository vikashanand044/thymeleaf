package in.cdac.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.cdac.main.entities.registeruser;



@Repository
public interface UserRepository extends PagingAndSortingRepository<registeruser, Integer> {
	
	List<registeruser> findByNameOrderByNameAsc(String name);
	

}


