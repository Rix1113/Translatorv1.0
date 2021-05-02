import java.util.Scanner;

public class FileChoose {

    public static void fileChoose() {
        Scanner scanner = new Scanner(System.in);

        FileList fileList = new FileList();

        //Kasutaja sisestab millist faili ta tahab
        System.out.println("Here are file list");
        fileList.fileList();
        System.out.print("Choose fail");
        String userChooseFile = scanner.nextLine();
        FilePath filePath1 = new FilePath(userChooseFile);
    }
}

