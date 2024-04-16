package lab_10_junit_test;

public class lab_10_junit_testFunction {
    
    // Method to add two numbers
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to concatenate two strings
    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        lab_10_junit_testFunction function = new lab_10_junit_testFunction();
        
        // Test addNumbers method
        int sum = function.addNumbers(5, 3);
        System.out.println("Sum of numbers: " + sum);
        
        // Test concatenateStrings method
        String result = function.concatenateStrings("Hello", "World");
        System.out.println("Concatenated string: " + result);
    }
}
