package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import models.Product;
import models.Task;
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

    public static void setProductionValues(Integer userID, Integer productID, Integer positionID,
    		String time, Boolean start, Integer quantity, Integer waste) {
    	if (productID == null) {
    		renderJSON(Product.findAll());
    	}
    	if (positionID == null) {
    		//We assume productID is already defined
    		renderJSON(Task.find("from Task task where task.product.id = ?", (long)productID).fetch());
    	}
    	
    	if (time != null) {
    		//The user has manually inputed the time field
    	} else if (start == true) {
    		//The user clicked on the start button
    		//Must save in the temporary table of the DB the intermediate fields
    		//Then redirect user to the main screen
    	}
    	
    	//...
    }
}
