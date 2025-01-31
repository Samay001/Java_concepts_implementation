class User{
    private String username;
    private String password;

    User(String username,String password){
        addUser(username,password);
    }

    void addUser(String username,String password){
        this.username = username;
        setPassword(password);
    }

    void setPassword(String password){
        if(password.length() > 8){
            this.password = password;
        }
        else{
            System.out.println("password is not valid");
        }
    }

    void getUsername(){
        System.out.println("Username:" + username);
    }

    void getPassword(){
        System.out.println("Password:"+ password);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        User u1 = new User("samay","12345678912");
        u1.getUsername();
        u1.getPassword();
    }
}
