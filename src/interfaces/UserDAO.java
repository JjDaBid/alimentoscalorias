package interfaces;


import entity.User;

public interface UserDAO {
    
    public int find(String user);
    
    public boolean create(User user);
    
    public User read(String username);
    
    public boolean update(User user);
    
    public boolean delete(String username);
    
}
