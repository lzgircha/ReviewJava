package review4;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //while loop, best to use when we don't know how many times we need to repeat a block of code (use while or do while)
        int a=1;
        while(a<=3){
            System.out.println("I am a while loop");
            a++;
        }

        //we go with do while code if we want to execute at least once even if the condition is false
        int b=1;
        do{
            System.out.println("do while");
            b++;
        }while(b>3);

        //Ask students if they understand loops?
        //if they don't -->tell them to practice more on loops
        //if they understand-->you good move to arrayconcep

        Scanner scan=new Scanner(System.in);
        String answer;
        do{
        System.out.println("Do you understand loops in Java");
         answer=scan.nextLine();
        }while(!answer.equalsIgnoreCase("yes"));

        System.out.println("Great job, let's learn arrays now");
    }
}
