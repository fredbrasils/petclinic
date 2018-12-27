package br.com.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Pet;
import br.com.petclinic.service.PetService;

@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{


}
