package services;

import entity.User;
import interfaces.UserDAO;
import java.util.ArrayList;
import java.util.List;

public class UserImp implements UserDAO{
    private List<User> users;

    public UserImp() {        
        users = new ArrayList<>();  
        User user1 = new User("aaa", "David", "Pinzon", "david@mail.com", new char[]{'a'});
        users.add(user1);
    }
    
    
    
    @Override
    public int find(String user){
        int n = -1;
        for(int i=0; i<users.size();i++){
            if(users.get(i).getUsername().equals(user)){
                n=i;
                break;
            }
        }
        return n;
    }
    
    @Override
    public boolean create(User user){
        if(find(user.getUsername())==-1){
            users.add(user);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public User read(String username){
        if(find(username)!=-1){
            return users.get(find(username));
            
        }else {
            return null;
        }
    }
    
    @Override
    public boolean update(User user){
        if(find(user.getUsername())!=-1){
            User tempUser = read(user.getUsername());
            tempUser.setPassword(user.getPassword());
            tempUser.setNames(user.getNames());
            tempUser.setSurnames(user.getSurnames());
            tempUser.setEmail(user.getEmail());
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean delete(String username){
        if(find(username) != -1){
            users.remove(find(username));
            return true;
        } else {
            return false;
        }
    }  
    
}
