package com.syntax.review1;

public class WorkingWithVariables {
    public static void main(String[] args) {
        //declared a variable and initialized it/create a variable and store value into it
        int number=10;
        //declared a variable
        int num;//declaration of a variable happens only once
         num=100; //initialize the variable
         num=200; //reassign the value
        System.out.println(num); //200

        String myString="Hello";
        String name="Artem";
        String address = "123 Test Drive";

        System.out.println(myString+" "+ name);
        int age = 21;
        //Artem is 21 years old
        System.out.println(name+" is "+age+" years old");
        // to get a sentence you have to have at least one String
        // plus sign (+) acts as concatenation

        char date='1';
        int day=14;
        System.out.println(date+day);//63 ascii - char 1=49, 49+14=63

    }
}
