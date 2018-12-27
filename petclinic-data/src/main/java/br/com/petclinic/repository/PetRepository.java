package br.com.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
