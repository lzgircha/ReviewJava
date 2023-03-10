package review11;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class EntrySetDemo1 {
    public static void main(String[] args) {

    Map <String, Double> fruits=new HashMap<>();
        fruits.put("apples",12.6);
        fruits.put("oranges",4.9);
        fruits.put("dragon fruits",5.6);
        fruits.put("cherries",13.8);
        fruits.put("pears",9.2);
        fruits.put("mango",10.6);
        fruits.forEach((x,y)-> System.out.println(x+" "+y));//watch streams on the utube!!!!
        //remove those elements which contain the letter a or e in their name and their price is more than 8 dollars
        //using lambda expression
    fruits.entrySet().removeIf(entry->(entry.getKey().contains("a")||entry.getKey().contains("e")) && entry.getValue()>8);
}}
