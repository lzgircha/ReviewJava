package review6;

public class Flower {

    //attributes, properties
static boolean pretty=true;
    String color, name;
    int price;

    //behavior

    void smell(){
        System.out.println(name+" smells good");
    }
    void bloom(){
        System.out.println(name+" flower blooms");
    }
    void grow(){
        System.out.println(name+" flower grows");
    }

}
