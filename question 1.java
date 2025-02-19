import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {
    
    public static void main(String[] args) {
        // List of string numbers
        String[] numberStrings = {"10", "20", "30", "40", "50"};
        
        // Convert strings to Integers
        List<Integer> numbers = parseStringToIntegerList(numberStrings);
        
        // Calculate the sum using autoboxing and unboxing
        int sum = calculateSum(numbers);
        
        // Print the sum
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to parse an array of strings into a list of Integer objects
    public static List<Integer> parseStringToIntegerList(String[] strings) {
        List<Integer> integerList = new ArrayList<>();
        for (String str : strings) {
            integerList.add(Integer.parseInt(str)); // Autoboxing
        }
        return integerList;
    }

    // Method to calculate the sum of a list of Integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }
}
