package review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String, Double> fruits=new HashMap<>();
        fruits.put("apples",12.6);
        fruits.put("oranges",4.9);
        fruits.put("dragon fruits",5.6);
        fruits.put("cherries",13.8);
        fruits.put("pears",9.2);
        fruits.put("mango",10.6);
        //print only those elements which contain letter a or e in their name and their price is more then 8 dollars

        var entrySet=fruits.entrySet();
        for(var entry:entrySet){
            if((entry.getKey().contains("a")|| entry.getKey().contains("e"))&& entry.getValue()>8){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
