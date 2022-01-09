package com.xworkz.State.entity;

import javax.persistence.*;

@Entity
@Table(name="State_details")
public class StateEntity {
	@Id
	@Column(name="state_id")
	private int id;
	@Column(name="state_name")
	private String name;
	@Column(name="state_noOfDist")
	private int noOfDist;
	@Column(name="state_capitalcity")
	private String capitalCity;
	public StateEntity(int id, String name, int noOfDist, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDist = noOfDist;
		this.capitalCity = capitalCity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDist() {
		return noOfDist;
	}
	public void setNoOfDist(int noOfDist) {
		this.noOfDist = noOfDist;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDist=" + noOfDist + ", capitalCity=" + capitalCity
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateEntity other = (StateEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
