package review3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            System.out.println("hello");
            i++;
        }
        //let's ask a user if he/she is tired as long as user is not tired->we will say let's study Java

        Scanner scan=new Scanner (System.in);
        System.out.println("Are you tired?");

        boolean tired=scan.nextBoolean();
        while(!tired){
            System.out.println("This is great");
            System.out.println("Let's study java");
            System.out.println("Are you tired?");
            tired=scan.nextBoolean();
        }
    }
}
