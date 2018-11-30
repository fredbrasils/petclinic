package br.com.petclinic.service.map;

import br.com.petclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet, Long>{

	@Override
	public Vet save(Vet entity) {
		return super.save(entity.getId(), entity);
	}

}
