package Day_63.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter #, type 00 to end");
        while (true) {
            Integer row3 = scanner.nextInt();
            if (row3.equals(00)) {
                break;
            }
            numbers.add(row3);
        }
        positive(numbers);
    }

    public static List<Integer> positive(List<Integer> numbers){

        ArrayList<Integer> getPosNumbers = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(getPosNumbers);
        return getPosNumbers;

    }
}