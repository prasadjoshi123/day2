package com.ibm.traveler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Traveler {
	
	@Id
	public Long id;
	@Column
	public String firstName;
	@Column
	public String lastName;

}
