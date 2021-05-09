import java.io.File;
import java.io.FilenameFilter;

public class FileList {

    //Toob v4lja kaustas olevad failid

    public static void fileList() {

        // try-catch block to handle exceptions
        try {
            //File f = new File("C:\\Users\\Riho\\Desktop\\Riho\\Kool\\SDA\\Projektid\\TranslatorV1.1");
            File f = new File("./");

            FilenameFilter filter = (f1, name) -> {
                // What extension we want
                return name.endsWith(".txt");
            };

            // Note that this time we are using a File class as an array,
            // instead of String
            File[] files = f.listFiles(filter);

            // Get the names of the files by using the .getName() method
            assert files != null;
            for (File file : files) {
                System.out.println(file.getName());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("------------------");



    }
}