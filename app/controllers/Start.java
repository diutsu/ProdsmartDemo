package controllers;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Start extends Job {
	public void doJob() {
		Fixtures.deleteDatabase();
		Fixtures.loadModels("data.yml");
	}
}
