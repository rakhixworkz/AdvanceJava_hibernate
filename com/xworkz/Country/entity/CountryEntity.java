package com.xworkz.Country.entity;
import javax.persistence.*;
@Entity
@Table(name="Country_details")
public class CountryEntity {
	@Id
	@Column(name="country_id")
	private int id;
	@Column(name="country_name")
	private String name;
	@Column(name="country_continent")
	private String continent;
	@Column(name="country_population")
	private long population;
	public CountryEntity(int id, String name, String continent, long population) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.population = population;
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
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "CountryEntity [id=" + id + ", name=" + name + ", continent=" + continent + ", population=" + population
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
		CountryEntity other = (CountryEntity) obj;
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
