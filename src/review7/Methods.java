package review7;

public class Methods {
    //user defined: with return type and without
    //             with parameters and without

    void sayHello(String name) {
        System.out.println("Hello" + name);
    }

    //create a method that returns the largest number between given 2 integer values

    int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    //create a methods that returns an average value of two decimal values

    double findAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    //create a method that returns reverse String from a given String
    String reverse(String given) {
        StringBuilder sb = new StringBuilder(given);
        return sb.reverse().toString();
    }
    //create a method that return a min value from given array
   public static int minFromArray(int[]array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<i){
                min=array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        String name = "Mohammed";
        int characters = name.length();
        System.out.println(characters);

        Methods obj = new Methods();
        obj.sayHello(name);

        System.out.println("------------");
        int largest = obj.findLargest(100, 200);
        System.out.println("The largest number is " + largest);

        System.out.println(obj.findAverage(10, 30));

        String reverse=obj.reverse("Hello");
        System.out.println(reverse);

        System.out.println("--------------------");
        int[]array={10,49,89,60};
        Methods.minFromArray(array);
        int minimum=minFromArray(array);
        System.out.println("Min number=" + minimum);
    }

}
