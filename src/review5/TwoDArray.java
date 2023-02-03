package review5;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {11, 12, 13},
                {20, 21, 22}
        };
        int numberOfArrays = array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Array = array[0].length;
        System.out.println(numberOfElementsIn1Array);

        System.out.println("---------getting all values from 2D array-----------");

        for (int[] arr : array) {//iterates over arrays
            for (int num : arr) {//iterates over each element
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
                System.out.print(num);
            }
        }
    }}
