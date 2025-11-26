public class Main {
    public static void main(String[] args) {
        String filename = "test2.txt";
        Student student = new Student("Name", "85458548544", 453, 8456);
        StudentFileStream studentFileStream = new StudentFileStream();
        studentFileStream.writeTOFiler(student, filename);
        studentFileStream.readFromFile(filename);
        Student resultStudent = studentFileStream.readFromFile(filename);
        studentFileStream.printData(resultStudent);
    }
}