package br.com.petclinic.service.map;

import org.springframework.stereotype.Service;

import br.com.petclinic.model.Pet;
import br.com.petclinic.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet entity) {
		return super.save(entity.getId(), entity);
	}

}
