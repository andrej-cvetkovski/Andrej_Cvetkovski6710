import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        List<String> secondList = new ArrayList<>();

        for (String elem : myList) {
            secondList.add(elem.substring(6));

            System.out.println(secondList);
        }
    }
}