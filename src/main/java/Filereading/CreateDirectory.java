package Filereading;

import java.io.File;
public class CreateDirectory {

   public static void main(String args[]) {
      String nameDir = "/javaBo";
      File a = new File(nameDir);
      
      // Создание на диске папки и всех вышестоящих каталогов
      a.mkdirs();
   }
}