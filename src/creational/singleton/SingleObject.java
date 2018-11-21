package creational.singleton;

public class SingleObject {

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}


    // Inner class to provide instance of class
    private static class BillPughSingleton
    {
        private static final SingleObject INSTANCE = new SingleObject();
    }

    public static SingleObject getInstance()
    {
        return BillPughSingleton.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}










//    //create an object of SingleObject
//    private static SingleObject instance;
//    //Get the only object available
//    public static SingleObject getInstance(){
//        if (instance == null)
//        {
//            //synchronized block to remove overhead
//            synchronized (SingleObject.class) {
//                // if instance is null, initialize
//                instance = new SingleObject();
//            }
//        }
//        return instance;
//    }