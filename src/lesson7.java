public class lesson7 {
    int age = 20;

    public static void main(String[] args) {
        lesson7 human = new lesson7();
        System.out.println(human.getAge(5,0.2,true, human));
    }
    double getAge(int i, double d, boolean bool, lesson7 human){
        return human.age;
    }
}
