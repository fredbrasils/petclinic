package br.com.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long>{

}
