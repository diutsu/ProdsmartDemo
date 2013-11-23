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

    public static void startProductionLogin() {
    	render();
    }
    public static void startProduction(Integer workerNumber) {
    	//usar o number para determinar o worker, por enquanto está hardcoded
        Worker worker = new Worker();
        worker.name = "Simao (" + workerNumber.toString() + ")";
        render(worker);
    }
    
    public static void finishProductionLogin() {
        render();
    }
    public static void finishProduction(Integer workerNumber) {
    	//usar o number para determinar o worker, por enquanto está hardcoded
        Worker worker = new Worker();
        worker.name = "Simao (" + workerNumber.toString() + ")";
        render();
    }
}
