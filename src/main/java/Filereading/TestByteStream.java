package Filereading;

import java.io.*;
public class TestByteStream {

   public static void main(String args[])throws IOException {

      // Запись строки в файл в кодировке UTF-8
      DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("D:\\test.txt"));
      dataOutput.writeUTF("А это прочтёшь?");
      dataOutput.writeUTF("А тож");

      // Чтение данных из того же файла
      DataInputStream dataInput = new DataInputStream(new FileInputStream("D:\\test.txt"));

      while(dataInput.available() > 0) {
         String a = dataInput.readUTF();
         System.out.println(a);
      }
   }
}