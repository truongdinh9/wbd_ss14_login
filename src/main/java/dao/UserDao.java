package dao;

import model.User;

import java.util.ArrayList;

public class UserDao {
    private static ArrayList<User> users=new ArrayList<>();
    static {
        users.add(new User("name","mail@mail","user","password"));
        users.add(new User("Dung","mail1@mail","admin","admin"));
        users.add(new User("name2","mail2@mail","admin","password"));
        users.add(new User("name3","mail3@mail","user","admin"));
        users.add(new User("name4","mail4@mail","admin","123456"));
    }
    public static User checkUser(String account, String password){
        for (User u:users) {
            if (u.getAccount().equals(account)&& u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }


}
