package TestStringAndStringManipulations;

public class test2 {
    public static void main(String[] args) {
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);
    }
}
