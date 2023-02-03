package review6;

public class StringMethods {
    public static void main(String[] args) {


     String str="Hello";
        System.out.println(str.length());//shoes how many characters (5)
        System.out.println(str.toUpperCase()); //(HELLO)
        System.out.println(str.charAt(1));//retrieve specific letter// (e)

        String newString=str.concat(" friends");//combine strings
        System.out.println(newString); //(Hello friends)

        System.out.println(str);//Hello
        str=str.toLowerCase();// if you want to reassign{you are not changing the object, just re-assigning to different one} the object str=(hello)
        System.out.println(str);

        boolean empty=str.isEmpty();//check if length of the String is more than 0
        System.out.println(empty);

        String str1=" Review B15 ";//new object/brand-new string will be created without spaces
        String newStr1=str1.trim();
       System.out.println(str1);
       System.out.println(newStr1);
}}
