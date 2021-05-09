import java.io.IOException;

public class FileChoose {

    public static void fileChoose() throws IOException {

        //Kasutaja sisestab millist faili ta tahab
        System.out.println("Here are file list\n" +
                "------------------");
        FileList.fileList();
        new FileName();
        Menu.menu();
    }
}

