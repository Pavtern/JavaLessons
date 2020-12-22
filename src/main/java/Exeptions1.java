import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions1 {
    public static void main(String[] args) {
        File file = new File("te3st");
        Exeptions1.read(file);
    }

    public static void read(File file){
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("sdsdsd");
        }
    }
}
