package kajo.ohjelma.control.domain.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kajo.ohjelma.control.domain.AaltoLpk;

@Repository
public interface LippuAaltoRepo extends CrudRepository<AaltoLpk, Long>{
	
	

}
