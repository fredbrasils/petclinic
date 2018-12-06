package br.com.petclinic.service.map;

import org.springframework.stereotype.Service;

import br.com.petclinic.model.Owner;
import br.com.petclinic.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
