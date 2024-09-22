import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) {
        try {                                     // Calling the method that may throw an exception
            readDataFromFile("example.txt");
        } catch (FileNotFoundException e) {                        // Handling the exception
            System.out.println("File not found guru: " );
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

    // Method declaration with throws clause
    public static void readDataFromFile(String fileName) throws FileNotFoundException {
        // Code that may throw a FileNotFoundException
        // For demonstration purposes, let's assume we're trying to open a file
        // Replace the following line with actual file handling code
        throw new FileNotFoundException("File not found sirj: " + fileName );
    }
}

