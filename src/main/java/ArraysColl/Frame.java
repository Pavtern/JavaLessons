package ArraysColl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Frame {
    public static void main(String[] args) {
        int[] nit = new int[100];
        for (int i = 0; i < 100; i++) {
            nit[i] = i+1;
        }
//        for (int nitos:nit ){
//            System.out.print(nitos + ", ");
//        }
        System.out.println(Arrays.toString(nit));
        List list = new ArrayList();

    }
}
