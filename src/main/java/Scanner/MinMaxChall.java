package Scanner;

import java.util.Scanner;

public class MinMaxChall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer minValue = null;
        Integer maxValue = null;
        System.out.println("Enter number: ");
        while (scanner.hasNextInt()){
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if(minValue == null || minValue > number){
                minValue = number;
            }
            if(maxValue == null || maxValue < number){
                maxValue = number;
            }
        }

            System.out.println("Min value = " + minValue);


            System.out.println("Max value = " + maxValue);

    }
}
