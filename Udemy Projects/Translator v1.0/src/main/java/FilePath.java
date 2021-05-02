import java.util.Scanner;

public class FilePath {
    String fileName;

    public FilePath() {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void filePath() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        this.fileName = sc.nextLine();
    }
}

/* See tahab uuesti kirjutamist */
