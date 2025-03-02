/*
- in java.io package
- Interface to indicate that an object can be closed to release resources it holds or to perform cleanup operations.
- Closeable interface extends the AutoCloseable interface
- FileInputStream class implements the Closeable interface, allowing it to be used in a try-with-resources statement.
- When the try block exits, whether normally or due to an exception, the close() method of FileInputStream will be automatically called, 
ensuring that the file input stream is closed properly.
 */

import java.io.*;

class Closeable {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            // Read from the file
            // ...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
