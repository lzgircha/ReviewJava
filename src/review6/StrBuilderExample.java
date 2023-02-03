package review6;

public class StrBuilderExample {
    public static void main(String[] args) {

        //this class is mutable collection of characters
        StringBuilder sb=new StringBuilder("Hello");            //StringBuilder() ---a constructor
        //all changes happen on the same object, you did not need to re-assign anything
        sb.reverse();
        System.out.println(sb);//olleH
        String str=sb.toString();// to convert from mutable to immutable (no more mutation allowed)
        str.toUpperCase();       //proves that String is immutable
        System.out.println(str);// olleH

        String str1=str.toUpperCase();
        System.out.println(str1);//OLLEH , string will change if you assign it to str1
    }
}
