import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    //Coding task:
    //Please write a small program and send it as a link to a git repository before the interview. (This is a personal task)
    //Android and Java developers should use Java
    //IOS should use Swift
    //The task for android and IOS:
    //Implement a function that will get a pointer to a one-way-linked list head and return an array of two linked lists.
    //First, of them, they should contain only odd elements from the input, while the second only even elements. Both returned lists should be in a reversed order
    public static List<LinkedList<Integer>> function(LinkedList<Integer> input) {
        final List<LinkedList<Integer>> result = new ArrayList<>();
        final LinkedList<Integer> odd = new LinkedList<>();
        final LinkedList<Integer> even = new LinkedList<>();

        for (Integer integer : input) {
            if (integer % 2 == 0) {
                even.add(integer);
            } else {
                odd.add(integer);
            }
        }

        Collections.reverse(odd);
        Collections.reverse(even);
        result.add(odd);
        result.add(even);
        return result;
    }
}
