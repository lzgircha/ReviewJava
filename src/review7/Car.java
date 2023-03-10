package review7;
public class Car {
    protected String make, model;
    int year, horsePower;
    public Car(String make, String model){ //we are overloading constructor
        this.make=make;
        this.model=model;
    }
    Car(String make, String model, int year, int horsePower){
        this(make,model);//calls constructor
        this.year=year;// accessing current class instance variables
        this.horsePower=horsePower;
    }
    public void start(){
        System.out.println(make+" starts");
    }
    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }

    //SAME class have 2 or more methods with same name = Method Overloading
    /*How to implement?
            1. by using different number of the parameters
            2. by using different type of the parameters
            3. sequence
     */
    void drive(String destination) {
        System.out.println(make+" drives to "+destination);
    }

    public void drive(int speed, String destination){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }

    void drive(String destination, int speed){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }}
    //am I overloading?
    /*
    String drive(String destination){ -NO
        return destination;
        }
        - we can not overload methods by changing it's return type
        In overloading methods signature MUST BE DIFFERENT
        method signature involves name and parameters ONLY!!!!

        In overloading we do not care about return type (can be changed)
        or access modifiers (can be different)
     */

