package Unit_3;

public class NumberTypeChecker {
    public static void main(String[] args) {
        String input = "123";
        if (isInteger(input)) {
            System.out.println(input + " is an Integer.");
        } else {
            System.out.println(input + " is not an Integer.");
        }
    }

    public static boolean isInteger(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Regular expression to match a valid integer
        String integerPattern = "^-?\\d+$";
        if (input.matches(integerPattern)) {
            try {
                // Attempt to parse the string as an integer
                Integer.parseInt(input);
                return true;
            } catch (NumberFormatException e) {
                // If parsing fails, it's not a valid integer
                return false;
            }
        } else {
            // If the string does not match the integer pattern
            return false;
        }
    }
}