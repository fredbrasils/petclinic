package br.com.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long>{

}
