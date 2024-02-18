import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File(".mensaje");
            boolean isCreated = file.createNewFile();
            if (!isCreated) {
                return;
            }
            System.out.println("Primera vez");
        } catch (IOException ignored) {
        }
    }
}