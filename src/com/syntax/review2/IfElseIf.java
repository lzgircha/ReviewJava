package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        /*if I have multiple conditions to test

        if (boolean condition){
        code A;
        } else if (boolean condition){
        code B;
        }else of (boolean condition){
        code C;
        }
         */
        int number = 30;
        if (number > 25) {
            System.out.println("great job!");
        } else if (number > 20) {
            System.out.println("good job");
        } else if (number > 10) {
            System.out.println("ok job");
        } else if (number > 5) {
            System.out.println("not good job");
        }
        String browser="firefox";
        if (browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser");
        }else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        }else if (browser.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");
        }else{      //if none of the conditions are true Java come to else block
            System.out.println("Browser is not supported");
        }
    }
}


