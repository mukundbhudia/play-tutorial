package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.util.Date;

public class Application extends Controller {

    public static Result index() {
        Date today = new Date();
        return ok("Hello world! The time is: " + today.toString());
    }

}
