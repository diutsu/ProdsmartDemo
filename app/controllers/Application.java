package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		String time = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());
		render(time);
	}

}