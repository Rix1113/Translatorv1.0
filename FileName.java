import java.util.Scanner;

public class FileName {

    private static String userInputFileName;

    public FileName() {
        userInputFileName = file();
    }

    public static String getUserInputFileName() {
        return userInputFileName;
    }

    private String file() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose file name (Filename.txt): ");
        return scanner.nextLine();
    }
}
