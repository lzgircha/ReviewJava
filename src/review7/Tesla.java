package review7;
//Tesla is a subclass of a Car class
//Car class is a superclass of Tesla
public class Tesla extends Car {

    String type;
    boolean autoPilot;
    public Tesla(String make, String model, int year,int horsePower, String type, boolean autoPilot){
        super(make, model, year, horsePower);
    this.type=type;
    this.autoPilot=autoPilot;
}
public void haveAutopilot(){

        System.out.println(make+" have auto pilot "+autoPilot);
}

public void start(){
    System.out.println(make+" starts automatically");
}}
