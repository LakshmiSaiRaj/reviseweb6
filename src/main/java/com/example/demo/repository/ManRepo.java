package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Man;

public interface ManRepo extends CrudRepository<Man, Integer> {
	
	List<Man> findByAname(String aname);
	List<Man> findByAidGreaterThan(int aid);
	
	
	@Query("from Man where atech=?1 order by aname")
	List<Man> findByAtechSorting(String atech); 

}
