import java.io.Serializable;

public class Student implements Serializable {

    String name;
    String phoneNumber;
    int indexNumber;
    transient int recordNumber;

    public Student() {
    }

    public Student(String name, String phoneNumber, int indexNumber, int recordNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.indexNumber = indexNumber;
        this.recordNumber = recordNumber;
    }
}
