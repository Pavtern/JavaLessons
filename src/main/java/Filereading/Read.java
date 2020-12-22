package Filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\terna\\OneDrive\\Рабочий стол\\New Text Document.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.print(scanner.nextLine() + ", ");
        }
//        String line = scanner.nextLine();
//        String[] numberStr = line.split(" ");
//        int[] number = new int[3];
//        int count = 0;
//        for(String num: numberStr){
//            number[count++] = Integer.parseInt(num);
//        }
//        System.out.println(Arrays.toString(number));
//        scanner.close();
    }

}
