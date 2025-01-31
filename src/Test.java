import java.util.*;

public class Test {
    public static void main(String[] args){
        System.out.println("hello word");

        //array list
        ArrayList<String> arr = new ArrayList<>();
        arr.add("samay");
        arr.add("rathod");

        System.out.println(arr.get(0)+" "+arr.get(1));

        //hashmap
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1, arr.get(0));
        m.put(2, arr.get(1));

        //loops
        for(int i=1;i<=m.size();i++){
            System.out.println(i+" " + m.get(i));
        }
        int i = arr.size()+1;
        while(i-->1){
            System.out.println(i+" " + m.get(i));
        }

        //set
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);

        System.out.println(s);

        //convert into string
        Integer in = 1;
        String str = in.toString();
        System.out.println(str);
        System.out.println(str.getClass());


    }
}
