package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import models.Worker;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        render(time);
    }

    public static void startProduction() {
        Worker worker = new Worker();
        worker.name = "Simao";
        render(worker);

    }

    public static void login() {
        String action = "startProduction.html";
        render(action);
    }
}
