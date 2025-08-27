package String.Level1;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            System.out.println(names[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This won't happen.");
        }
    }
}
