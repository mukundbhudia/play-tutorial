package models;

import play.data.validation.Constraints;

import java.util.ArrayList;
import java.util.List;

/**
    @Author Mukund Bhudia
 */
public class Task {

    public Long id;

    @Constraints.Required
    public String label;

    public static List<Task> all() {
        return new ArrayList<Task>();
    }

    public static void create(Task task) {

    }

    public static void delete(Long id) {

    }

}
