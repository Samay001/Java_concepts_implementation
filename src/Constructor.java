//default constructor
class DefaultConstructor{
    DefaultConstructor(){
         System.out.println("default constructor");
    }
};

//parameter constructor
class ParameterConstructor{
    ParameterConstructor(String name){
        System.out.println(name);
    }
}

public class Constructor {
    public static void main(String[] args){
        DefaultConstructor obj = new DefaultConstructor();
        ParameterConstructor obj2 = new ParameterConstructor("Samay");
    }
}
