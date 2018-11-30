package br.com.petclinic.service.map;

import br.com.petclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>{

	@Override
	public Owner save(Owner entity) {
		return super.save(entity.getId(), entity);
	}

}
