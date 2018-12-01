package br.com.petclinic.service.map;

import org.springframework.stereotype.Service;

import br.com.petclinic.model.Vet;
import br.com.petclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet entity) {
		return super.save(entity.getId(), entity);
	}

}
