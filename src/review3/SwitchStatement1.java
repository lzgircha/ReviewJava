package review3;

import java.util.Scanner;

public class SwitchStatement1 {
    public static void main(String[] args) {
        //using Scanner ask user to enter browser, based on the browser->execute code
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite browser");
        String browser=scan.nextLine();

        switch (browser.toLowerCase()){//to ignore upper case Safari=>safari

            case"chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case"safari":
                System.out.println("Test case executed in "+browser);
                break;
            case"microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - no execution");
        }
    }
}
