package review5;

public class ArraysReview {
    public static void main(String[] args) {
        int a = 10;

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[2]);
        //System.out.println(arr[3]); RunTime error: ArrayIndexOutOfBoundsExcept
        System.out.println("Size of the array =" + arr.length);

        //to get all values from the array?

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        String[] colors={"black","white","red","purple","blue"};
        //any time we have arrays we can use enhanced for loop

        for(String color:colors){
            System.out.print(color+" ");

        }//using for loop
        System.out.println("___________________");
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i]+" ");

        }

        System.out.println("----printing in reverse-----");
        for (int i = colors.length-1; i >=0 ; i--) {
            System.out.print(colors[i]+"; ");
        }

        }
    }

