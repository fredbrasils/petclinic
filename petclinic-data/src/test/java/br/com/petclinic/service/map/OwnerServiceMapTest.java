package br.com.petclinic.service.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.petclinic.model.Owner;

public class OwnerServiceMapTest {

	OwnerServiceMap ownerServiceMap;
	
	Long ownerId = 1l;
	String lastName = "Brasil";
	
	@BeforeEach
	void setUp() {
		ownerServiceMap = new OwnerServiceMap();
		
		ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
	}
	
	@Test
	public void findAll(){
		Set<Owner> ownerList = ownerServiceMap.findAll();
		assertEquals(1, ownerList.size());
	}
	
	@Test
	public void findById() {
		Owner owner = ownerServiceMap.findById(ownerId);
		assertEquals(ownerId, owner.getId());
	}
	
	@Test
	public void save() {
		Long id = 2l;
		Owner owner2 = Owner.builder().id(id).build();
		Owner ownerSaved = ownerServiceMap.save(owner2);
		
		assertEquals(id, ownerSaved.getId());
	}
	
	@Test
	public void saveNoId() {
		Owner ownerSaved = ownerServiceMap.save(Owner.builder().build());
		
		assertNotNull(ownerSaved);
		assertNotNull(ownerSaved.getId());
	}
	
	@Test
	public void delete() {
		
		ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
		assertEquals(0, ownerServiceMap.findAll().size());
	}
	
	@Test
	public void deleteById() {
		
		ownerServiceMap.deleteById(ownerId);
		assertEquals(0, ownerServiceMap.findAll().size());
	}
	
	@Test
	public void findByLastName() {
		
		Owner ownerBrasil = ownerServiceMap.findByLastName(lastName);
		assertNotNull(ownerBrasil);
		assertEquals(ownerId, ownerBrasil.getId());
		assertEquals(lastName, ownerBrasil.getLastName());
	}
	
	@Test
	public void findNoOwnerByLastName() {
		
		Owner owner = ownerServiceMap.findByLastName("arriel");
		assertNull(owner);
	}
}
