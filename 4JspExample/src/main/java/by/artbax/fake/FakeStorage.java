package by.artbax.fake;

import by.artbax.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;
    static {
        storage = new FakeStorage();
    }
    private List<User> users;

    private FakeStorage(){
        this.users = new ArrayList<>();
        User user1 = new User("Marsel", "Marsel", LocalDate.parse("1994-02-02"));
        User user2 = new User("Mile", "Smile", LocalDate.parse("1999-05-05"));
        User user3 = new User("Tatiana", "Arni", LocalDate.parse("1989-06-02"));

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public static FakeStorage storage(){
        return storage;
    }
    public List<User> users(){
        return users;
    }
}
