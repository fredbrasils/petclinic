package br.com.petclinic.service.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Speciality;
import br.com.petclinic.repository.SpecialityRepository;
import br.com.petclinic.service.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityJPAService implements SpecialityService{

	private final SpecialityRepository specialityRepository;
	
	public SpecialityJPAService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality entity) {
		return specialityRepository.save(entity);
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialitys = new HashSet<>();
		specialityRepository.findAll().forEach(specialitys::add);
		return specialitys;
	}

	@Override
	public void delete(Speciality entity) {
		specialityRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
	}
	
}
