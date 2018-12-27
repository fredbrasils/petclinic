package br.com.petclinic.service.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Pet;
import br.com.petclinic.repository.PetRepository;
import br.com.petclinic.service.PetService;

@Service
@Profile("springdatajpa")
public class PetJPAService implements PetService{

	private final PetRepository petRepository;
	
	public PetJPAService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet entity) {
		return petRepository.save(entity);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public void delete(Pet entity) {
		petRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}
	

	
}
