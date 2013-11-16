package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Worker extends Model {
	Integer number;
}
