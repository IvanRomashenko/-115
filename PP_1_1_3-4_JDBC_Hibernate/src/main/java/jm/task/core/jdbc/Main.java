package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private static UserServiceImpl userService = new UserServiceImpl();
    private static User user1= new User("name1", "lastName1", (byte) 1);
    private static User user2= new User("name2", "lastName2", (byte) 2);
    private static User user3= new User("name3", "lastName3", (byte) 3);
    private static User user4= new User("name4", "lastName4", (byte) 4);

    public static void main(String[] args) throws SQLException {
       userService.createUsersTable();
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        userService.getAllUsers();
     //   userService.cleanUsersTable();
   //     userService.dropUsersTable();
        userService.removeUserById(2);
    }
}
