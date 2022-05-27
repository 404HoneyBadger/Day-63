package Day_63.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

//        // Average of numbers
//        System.out.println("Problem 1");
//        while (true) {
//            String row = scanner.nextLine();
//            if (row.equals("end")) {
//                break;
//            }
//            input.add(row);
//        }
//        double average = input.stream()
//                .mapToInt(v -> Integer.valueOf(v))
//                .average()
//                .getAsDouble();
//
//        System.out.println("average of the numbers: " + average);

//        Average of selected numbers
//        List<String> numN = new ArrayList<>();
//        System.out.println("Problem 2 \n nput numbers, type \"end\" to stop");
//        while (true) {
//            String row3 = scanner.nextLine();
//            if (row3.equals("end")) {
//                break;
//            }
//            numN.add(row3);
//        }
//
//        while (true) {
//            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p) \n input numbers, type \"end\" to stop");
//            String row3 = scanner.nextLine();
//            if(row3.equals("end")){
//                break;
//            } else if (row3.equals("n")) {
//                double negative = numN.stream()
//                        .mapToDouble(a -> Integer.valueOf(a))
//                        .filter(a -> a < 0)
//                        .average().getAsDouble();
//                System.out.println("Average of the negative numbers: " + negative);
//            }else{
//                if(row3.equals("p")){
//                    double positive = numN.stream()
//                            .mapToDouble(a -> Integer.valueOf(a))
//                            .filter(a -> a >= 0)
//                            .average().getAsDouble();
//                    System.out.println("Average of the positive numbers: " + positive);
//                    continue;
//                }
//                System.out.println("Wrong input");
//                continue;
//            }
//        }

//        Positive Numbers

    }
}
