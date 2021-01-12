package Scanner;

import java.util.Scanner;

public class Scannero {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter 10 integers");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(counter != 10) {
            System.out.println("Enter integer #" + (counter+1));
            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
            }
            else {
                System.out.println("Invalid number");
            }
            counter++;
            scanner.nextLine();
        }
//        int num = scanner.nextInt();
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();
//        int num6 = scanner.nextInt();
//        int num7 = scanner.nextInt();
//        int num8 = scanner.nextInt();
//        int num9 = scanner.nextInt();
//        int sum = num+num1+num2+num3+num4+num5+num6+num7+num8+num9;


        System.out.println("Your sum is: " + sum);
        scanner.close();
    }
}
