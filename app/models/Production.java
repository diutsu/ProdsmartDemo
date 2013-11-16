package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Production extends Model {
	@ManyToOne
	Worker worker;
	
	@ManyToOne
	Task task;
	Integer quantity;
	Integer secondsSpent;
}
