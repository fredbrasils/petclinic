package br.com.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Owner extends Person {

	private static final long serialVersionUID = 1L;

	@Column
	private String address;
	@Column
	private String city;
	
	@Column
	private String telephone;
	
	@OneToMany(mappedBy="owner", cascade= CascadeType.ALL)
	private Set<Pet> pets = new HashSet<>();

}
