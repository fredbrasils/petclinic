package br.com.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Speciality;
import br.com.petclinic.service.SpecialityService;

@Service
@Profile({"default","map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService{

}
