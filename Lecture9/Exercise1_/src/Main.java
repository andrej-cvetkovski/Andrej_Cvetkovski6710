import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "test1.txt";
        Example example = new Example(5, "Davor", 20);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(example);
            System.out.println("Object serialized, before deserialization: ");
            print(example);
            example.name = "Other name";
            example.transientInt = 10;
            Example.staticInt = 50;

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            example = (Example) objectInputStream.readObject();
            System.out.println("After deserialization: ");
        } catch (IOException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void print(Example e) {
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Static int: " + Example.staticInt);
        System.out.println("Transient int: " + e.transientInt);
    }
}

