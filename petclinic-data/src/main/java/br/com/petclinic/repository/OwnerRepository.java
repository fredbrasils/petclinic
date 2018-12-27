package br.com.petclinic.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

	Optional<Owner> findByLastName(String lastName);

}
