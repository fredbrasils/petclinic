package br.com.petclinic.service.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Owner;
import br.com.petclinic.repository.OwnerRepository;
import br.com.petclinic.service.OwnerService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Profile("springdatajpa")
public class OwnerJPAService implements OwnerService{

	private final OwnerRepository ownerRepository;
	
	public OwnerJPAService(OwnerRepository ownerRepository) {
		super();
		log.debug("Create OwnerJPAService");
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner entity) {
		return ownerRepository.save(entity);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public void delete(Owner entity) {
		ownerRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
	}
	
	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName).orElse(null);
	}

	
}
