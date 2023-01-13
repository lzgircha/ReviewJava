package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        /* nested if is 1 is statement inside another if statement
        when we have one condition that depends on another
         */
        int dose = 2;
        boolean vaccine = true;
        if (vaccine) { //outer if
            System.out.println("How many doses you have?");
            if (dose == 1) { //inner if
                System.out.println("You need a second shot");
            } else {
                System.out.println("You are fully vaccinated");
            }
        } else {//pay attention to what 'if' 'else' relates to inner or outer
            System.out.println("I do not have a vaccine");
        }
    }
}
