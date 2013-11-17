package controllers;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void login() {
        String action = "startProduction.html";
        render(action);
    }
}