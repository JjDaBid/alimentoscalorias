package Controller;

import entity.User;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import services.UserImp;


public class UserController {
    
    
    
    private static UserImp userImp = new UserImp();
    public static String usernameAuth;
    public static String userForLabel;
    private User authenticatedUser;
    
    public static boolean authenticate(String username, char[] password){
        
        if(read(username)!=null){
            User userAuth = read(username);
            if(userAuth.getUsername().equals(username) && Arrays.equals(userAuth.getPassword(), password)){                
                usernameAuth = userAuth.getUsername();                
                return true;
            }else{
                return false;
            }
        } else{
            return false;
        }       
    }
    
    public static boolean isLoggedIn() {        
        return usernameAuth != null;
    }
    
    public static boolean logout(){
        return isLoggedIn() == false;
    }

    
   
    public static String getCurrentUser() {
        if (isLoggedIn()) {
            System.out.println("getCurrentUser() de controller " + userImp.read(usernameAuth).getNames());
            return userImp.read(usernameAuth).getNames();
        } else {
            return null;
        }
    }    
        
    public static boolean passwordValidator(char[] password, JFrame Register) {
    boolean isValid = false;

    // Verificar si la contraseña tiene al menos 8 caracteres y al menos un caracter especial
    if (password.length >= 8 && Pattern.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*", String.valueOf(password))) {
        isValid = true;
    }
    if (isValid) {        
        return true;
    } else {
        JOptionPane.showMessageDialog(Register, "Las contraseñas debe tenerner minio 8 caracteres y al menos uno de ser especial");
        return false;
    }}
    
    public static boolean mailValidator(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
        
    public static boolean create(
            String username, 
            String name, 
            String surname, 
            String email, 
            char[] password, 
            char[] confirmPassword, 
            JFrame register){
        
        if(mailValidator(email)){
            
        
        
            if(passwordValidator(password, register)){

                if(Arrays.equals(password, confirmPassword)){
                    User user = new User(username, name, surname, email, password);
                    JOptionPane.showMessageDialog(register, "Usuario registrado exitosamente");
                    register.dispose();
                    return userImp.create(user);
                } else {
                    JOptionPane.showMessageDialog(register, "Las contraseñas no concuerdan");
                    return false;
                }

            } return false;
            
        } else {
            JOptionPane.showMessageDialog(register, "El correo electrónico no es válido");
                    return false;
        }
        
    }
    
    public static User read(String username){
        return userImp.read(username);
    }
    
    public static boolean update(User user){
        return userImp.update(user);
    }
    
    public static boolean delete(String user){
        return userImp.delete(user);
    }
}
