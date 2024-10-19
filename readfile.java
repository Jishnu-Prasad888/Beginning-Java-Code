import java.io.*;

class readfile { 
    public static void main(String[] args) {
        int content;
        FileInputStream fin;

        // Check if the correct number of arguments is provided
        if(args.length != 1) { 
            System.out.println("Enter the file name as the argument");
            return; // Added a semicolon here
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) { // Fixed the exception handling syntax
            System.out.println("Cannot open file: " + e);
            return; // Exit if the file cannot be opened
        }

        try { 
            // Read the file content until the end
            while ((content = fin.read()) != -1) { // Fixed the loop condition
                System.out.print((char) content); // Corrected to use 'content' instead of 'i'
            }
        } catch (IOException e) { 
            System.out.println("Error reading file: " + e);
        } finally {
            // Ensure the file is closed properly
            try {
                fin.close();
            } catch(IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}
