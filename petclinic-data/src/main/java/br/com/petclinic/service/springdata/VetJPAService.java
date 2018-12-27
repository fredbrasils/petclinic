package br.com.petclinic.service.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Vet;
import br.com.petclinic.repository.VetRepository;
import br.com.petclinic.service.VetService;

@Service
@Profile("springdatajpa")
public class VetJPAService implements VetService{

	private final VetRepository vetRepository;
	
	public VetJPAService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet entity) {
		return vetRepository.save(entity);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void delete(Vet entity) {
		vetRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}
	
}
