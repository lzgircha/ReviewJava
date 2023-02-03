package review6;

public class Garden {
    public static void main(String[] args) {
//flower 1,2,3 are local variables, it is not visible from another block of code/mathod
        //static String str; cannot use static for local variable
        Flower flower1=new Flower();
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;//not the right way to access static variable but it is possible
        System.out.println("Hibiscus pretty? "+flower1.pretty);

        //accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the flower class");
        Flower flower2=new Flower();
        System.out.println("Roses are pretty? "+flower2.pretty);
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;//reassign the price

        flower2.bloom();
        flower2.grow();
        flower2.smell();


        Flower flower3=new Flower();

        //variable i-is a local to it's block of code-loop
        for (int i = 0; i <=3; i++) {
            System.out.println(i);
        }
        //System.out.println(i); error since i is dicleared inside of the code
    }
}
