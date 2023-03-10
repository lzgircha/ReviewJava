package review8;

import review7.Car;
import review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw=new Bmw( "Bmw","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();//comes from BMWs subclass

        Car car=new Car("SomeCar","SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","S",2022, 350, "electric", true);
        tesla.start();//overrided method from Tesla class is executed
        tesla.drive(75);//comes from Parent class
        tesla.haveAutopilot();//comes from Tesla class

        //Runtime polymorphism achieved through method overriding
        //casting: widening and narrowing - used with primitives
        Car bmw1=new Bmw("Bmw","X7");//upcasting
        bmw1.start();
        bmw1.drive(100);
        bmw1.drive(120,"Miami");
    }
}
