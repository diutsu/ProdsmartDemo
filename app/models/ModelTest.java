package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class ModelTest extends Model {
	Integer name;
}
