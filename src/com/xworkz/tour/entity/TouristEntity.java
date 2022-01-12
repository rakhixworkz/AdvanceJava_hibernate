package com.xworkz.tour.entity;
import javax.persistence.*;
@Entity
@Table(name="tourist_table")
public class TouristEntity {
	@Id
	private int tid;
	@Column(name="t_location")
	private String location;
	@Column(name="t_seaLevel")
	private String seaLevel;
	@Column(name="t_famousFor")
	private String famousFor;
	@Column(name="t_entryFees")
	private int entryFees;
	@Column(name="t_season")
	private String season;
	public TouristEntity(int tid, String location, String seaLevel, String famousFor, int entryFees, String season) {
		super();
		this.tid = tid;
		this.location = location;
		this.seaLevel = seaLevel;
		this.famousFor = famousFor;
		this.entryFees = entryFees;
		this.season = season;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSeaLevel() {
		return seaLevel;
	}
	public void setSeaLevel(String seaLevel) {
		this.seaLevel = seaLevel;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public int getEntryFees() {
		return entryFees;
	}
	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	@Override
	public String toString() {
		return "TouristEntity [tid=" + tid + ", location=" + location + ", seaLevel=" + seaLevel + ", famousFor="
				+ famousFor + ", entryFees=" + entryFees + ", season=" + season + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + entryFees;
		result = prime * result + ((famousFor == null) ? 0 : famousFor.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((seaLevel == null) ? 0 : seaLevel.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + tid;
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
		TouristEntity other = (TouristEntity) obj;
		if (entryFees != other.entryFees)
			return false;
		if (famousFor == null) {
			if (other.famousFor != null)
				return false;
		} else if (!famousFor.equals(other.famousFor))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (seaLevel == null) {
			if (other.seaLevel != null)
				return false;
		} else if (!seaLevel.equals(other.seaLevel))
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (tid != other.tid)
			return false;
		return true;
	}
	
	

}
