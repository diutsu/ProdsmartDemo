package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Worker extends Model {
	public String name;
	public Integer number;

	public Integer getNumber() {
		return number;
	}
}
