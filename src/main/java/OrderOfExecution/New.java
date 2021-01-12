package OrderOfExecution;

public class New {
    static String sd = "sdasda";
    public New(String str){
        System.out.println("Hello");
        New.no();
    }

    {
        System.out.println("static");
    }
    public static void main(String[] args) {

        System.out.println("hi");
        New newNew = new New(sd);
        New newNew2 = new New(sd);
    }
    public static void no(){
        System.out.println("Say \"no\"");
    }
}
