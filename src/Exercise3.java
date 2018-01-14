//Write a Stream Expression to get the squared value
// of the positive numbers from the following array:
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        List<Integer> squaredList = numbers.stream()
                .filter(integer -> integer > 0)
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        System.out.println(squaredList);
    }
}
