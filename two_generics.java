// Define a generic class named "two_generics" with two type parameters, T and U
// T represents the type for the first value in the two_generics
// U represents the type for the second value in the two_generics
public class two_generics<T, U> {

    // Two private fields to hold the values of the two_generics
    private T first;  // Value of type T
    private U second; // Value of type U

    // Constructor to initialize both the first and second values
    public two_generics(T first, U second) {
        this.first = first;   // Set the first value
        this.second = second; // Set the second value
    }

    // Getter method for the first value (of type T)
    public T getFirst() {
        return first;
    }

    // Getter method for the second value (of type U)
    public U getSecond() {
        return second;
    }

    // Setter method for the first value (of type T)
    public void setFirst(T first) {
        this.first = first;
    }

    // Setter method for the second value (of type U)
    public void setSecond(U second) {
        this.second = second;
    }

    // Method to return a string representation of the two_generics
    @Override
    public String toString() {
        return "two_generics{" +
               "first=" + first +
               ", second=" + second +
               '}';
    }

    // Main method to demonstrate the use of the two_generics class
    public static void main(String[] args) {
        // Create a two_generics where the first element is a String and the second is an Integer
        two_generics<String, Integer> two_generics1 = new two_generics<>("Age", 30);

        // Print the two_generics details
        System.out.println(two_generics1); // Output: two_generics{first=Age, second=30}

        // Create a two_generics where the first element is a Double and the second is a Boolean
        two_generics<Double, Boolean> two_generics2 = new two_generics<>(3.14, true);

        // Print the second two_generics details
        System.out.println(two_generics2); // Output: two_generics{first=3.14, second=true}
    }
}
