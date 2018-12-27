package br.com.petclinic.service.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.PetType;
import br.com.petclinic.repository.PetTypeRepository;
import br.com.petclinic.service.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeJPAService implements PetTypeService{

	private final PetTypeRepository petTypeRepository;
	
	public PetTypeJPAService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType entity) {
		return petTypeRepository.save(entity);
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public void delete(PetType entity) {
		petTypeRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}
	
}
