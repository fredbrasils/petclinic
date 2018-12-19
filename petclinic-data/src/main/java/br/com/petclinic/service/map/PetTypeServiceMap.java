package br.com.petclinic.service.map;

import org.springframework.stereotype.Service;

import br.com.petclinic.model.PetType;
import br.com.petclinic.service.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService{


}
