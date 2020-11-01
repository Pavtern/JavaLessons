package ProgLang;


public class IndexOf {


    int[] n = {1,5,3,4,6};

    public static void main(String[] args) {
        IndexOf indexOf = new IndexOf();
        indexOf.ds();
    }

    public static int indexOf(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public void ds(){

        for (int x : n) {
            System.out.print(x);
            if (n.length - 1 != indexOf(n, x)) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println(toString(n));

    }

    public String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append("");
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append("").toString();
            b.append(", ");
        }
    }

}



