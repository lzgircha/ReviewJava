package review6;

public class StringMethods1 {
    public static void main(String[] args) {

        String myString="Today is February 2";
        String[] strArray=myString.split(" ");//splits each word before space, split sentence based on space
        // to store the words/elements we will need an array

        for(String s:strArray){
            System.out.println(s);
        }

        System.out.println("  ---------------------------------  ");

        System.out.println(myString);
        String newStr=myString.substring(9,13);//use indexes/int beginning and ending
        System.out.println(newStr);

        int index=newStr.indexOf('b');
        System.out.println("Index of character b is  = "+index);

        String anotherStr="Today si Thursday";
        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is = "+index);
    }
}
