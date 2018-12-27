package br.com.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.petclinic.model.Visit;
import br.com.petclinic.service.VisitService;

@Service
@Profile({"default","map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService{

}
