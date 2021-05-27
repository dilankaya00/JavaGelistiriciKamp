package com.example.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobPositions")
public class JobPositions {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="positions")
	private String positions;

	public JobPositions() {
		
	}
	public JobPositions(int id, String positions) {
		super();
		this.id = id;
		this.positions = positions;
	}
	
	
}
