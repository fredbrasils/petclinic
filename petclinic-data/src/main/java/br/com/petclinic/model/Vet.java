package br.com.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vet extends Person{

	private static final long serialVersionUID = 1L;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="vet_speciality", joinColumns=@JoinColumn(name="vet_id"),
				inverseJoinColumns=@JoinColumn(name="speciality_id"))
	private Set<Speciality> specialities = new HashSet<>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	

}
