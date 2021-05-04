import java.io.IOException;

public class FileChoose {

    public static void fileChoose() throws IOException {

        FileList fileList = new FileList();

        //Kasutaja sisestab millist faili ta tahab
        System.out.println("Here are file list\n" +
                "------------------");
        fileList.fileList();
        FileName fileName = new FileName();
        Menu.menu();
    }
}

