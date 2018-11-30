package br.com.petclinic.service.map;

import br.com.petclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet, Long>{

	@Override
	public Pet save(Pet entity) {
		return super.save(entity.getId(), entity);
	}

}
