import java.util.Scanner;

public class FileName {

    private static String userInputFileName;

    public FileName() {
        this.userInputFileName = file();
    }

    public static String getUserInputFileName() {
        return userInputFileName;
    }

    public void setUserInputFileName(String name) {
        this.userInputFileName = file();
    }

    private String file() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose file name (Filename.txt): ");
        String name = scanner.nextLine();
        return name;
    }
}
