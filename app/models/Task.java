package models;

import play.data.validation.*;
import play.db.ebean.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.*;

/**
    @Author Mukund Bhudia
 */
@Entity
public class Task extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String label;

    public static Finder<Long , Task> find = new Finder(
            Long.class, Task.class
    );

    public static List<Task> all() {
        return find.all();
    }

    public static void create(Task task) {
        task.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

}
