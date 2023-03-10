package review7;

public class Garage {
    public static void main(String[] args) {
        Tesla tesla=new Tesla("Tesla","S", 2022, 340, "electric", true );
        //from super class
        tesla.start();
        tesla.drive(100);

}
}