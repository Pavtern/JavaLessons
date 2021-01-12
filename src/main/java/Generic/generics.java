package Generic;

class A<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class generics {
    static<E> void print(E[] elements){
        for(E element:elements){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        A<String> obj=new A<String>();
        A<Integer> obj1=new A<Integer>();
        obj.add("hello");
        obj.add("hello1");
        obj1.add(6);
        System.out.println(obj.get());
        System.out.println(obj1.get());

        Integer[] arr={1,3,5,7};
        print(arr);
    }
}