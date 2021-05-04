import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileList {

    //Toob v4lja kaustas olevad failid

    public void fileList() throws IOException {


        // try-catch block to handle exceptions
        try {
            File f = new File("C:\\Users\\Riho\\Desktop\\Riho\\Kool\\SDA\\Projektid\\TranslatorV1.1");

            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File f, String name) {
                    // What extension we want
                    return name.endsWith(".txt");
                }
            };

            // Note that this time we are using a File class as an array,
            // instead of String
            File[] files = f.listFiles(filter);

            // Get the names of the files by using the .getName() method
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("------------------");



    }
}