class Users{
    String username;
    String user_email;

    public Users(String username,String user_email){
        this.username = username;
        this.user_email = user_email;
    }

    void loginUser(){
        System.out.println(username + " login successfully" );
    }
}

class NewManager extends Users{
    public NewManager(String username,String user_email){
        super(username,user_email);
    }
}

class NewDeveloper extends Users{
    public NewDeveloper(String username,String user_email){
        super(username,user_email);
    }
}


public class Inheritance {
    public static void main(String[] args){
        NewManager m1 = new NewManager("samay","samayrathod1@gmail.com");
        m1.loginUser();

        NewDeveloper d1 = new NewDeveloper("anonymous","anonymous@gmail.com");
        d1.loginUser();
    }

}
