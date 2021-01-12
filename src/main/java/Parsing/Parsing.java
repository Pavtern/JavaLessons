package Parsing;

public class Parsing {
    public static void main(String[] args) {
        String numberAsString = "2018";
        int number = Integer.parseInt(numberAsString) + 2;
        numberAsString = Integer.toString(number);
        System.out.println(numberAsString+ " как строка");

    }
}
