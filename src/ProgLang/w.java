package ProgLang;

public class w {

    int v = 1;
    static int u = 1;

    public static void main(String[] args) {
        w w2 = new w();
        w w1 = new w();
        w2.v = w2.v +1;
        System.out.println(w2.v);
        w1.v = w1.v +1;
        System.out.println(w1.v);
        w1.u = w1.u +1;
        System.out.println(w1.u);
        w2.u = w2.u +1;
        System.out.println(w2.u);
        int a = 0;
        int b = 0;
    }
}
