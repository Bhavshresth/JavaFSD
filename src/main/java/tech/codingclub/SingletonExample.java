package tech.codingclub;

public class SingletonExample {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getSingletonInstance(55);
        Singleton obj2 = Singleton.getSingletonInstance(90);

        obj1.data = 55;//As we have single reference so every object will have effect!
        obj2.data = 90;

        System.out.println(obj1.data + " & " + obj2.data);
    }
}
