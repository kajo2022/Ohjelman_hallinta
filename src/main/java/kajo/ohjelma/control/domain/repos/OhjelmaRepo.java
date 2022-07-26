package kajo.ohjelma.control.domain.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import kajo.ohjelma.control.domain.Ikakausi;
import kajo.ohjelma.control.domain.Kategoria;
import kajo.ohjelma.control.domain.Ohjelma;

public interface OhjelmaRepo extends CrudRepository<Ohjelma, Integer>{
	
	@Query(value ="SELECT * from main WHERE pvm = :date", nativeQuery= true)
	List<Ohjelma> findAllByDate(@Param("date") String date);
	
	List<Ohjelma> findAllByKategoria(Kategoria kategoria); 
	
	List<Ohjelma> findAllByIkakausi(Ikakausi ikakausi); 

}
