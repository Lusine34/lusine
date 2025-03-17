//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this is homework.txt

    }
}
//homework
import java.util.List;
public class Main
{ public static void findFirstOddGreaterThan10(List<Integer> numbers)
{ for (int num : numbers) {
    if (num > 0 && num > 10 && num % 2 == 1)
    {
        System.out.println(num); return;

    } } System.out.println("Չկա համապատասխան թիվ");
} public static void main(String[] args) { List<Integer> numbers = List.of(3, -5, 8, 12, 15, 7, 21);
    findFirstOddGreaterThan10(numbers);

} }