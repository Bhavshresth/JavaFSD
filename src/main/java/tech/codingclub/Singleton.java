package tech.codingclub;

public class Singleton {

    //    we want same memory to be accessed
    private static Singleton singleton;//only one reference
    public int data;

    private Singleton(int data) {
        this.data = data;
        System.out.println("Constructor was called when data was :" + data);
    }

    public static Singleton getSingletonInstance(int data) {
        if (singleton == null) {
            singleton = new Singleton(data);
            //Creating a new object and taking space in member method

        }

        return singleton;

    }
}
