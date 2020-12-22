package Filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWriting {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello World!");
        pw.close();
    }
}
