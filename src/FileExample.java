import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {
    static void readFile(Scanner myReader) {
        while(myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }

    static void getFileInformation(File myObj) {
        if(myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    static void writeToFile(File myObj, String content) {
        try {
            java.io.FileWriter myWriter = new java.io.FileWriter(myObj);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (java.io.IOException e) {
            System.out.println("Error writing to the file.");
        }
    }

    static void deleteFile(File myObj) {
        if(myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        getFileInformation(myObj);
        readFile(myReader);
        myReader.close();
    }
}
