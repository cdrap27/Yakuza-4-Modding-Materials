package Read;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class openCSV {
    private static ArrayList<String> lines;

    public static void setLines() throws IOException {
        BufferedReader br = Files.newBufferedReader(Path.of("designs.csv"), StandardCharsets.US_ASCII);
         lines = new ArrayList<String>();
        String newLine;
        while((newLine = br.readLine())!= null){
            System.out.println(newLine);
            lines.add(newLine);
        }
    }

    public static ArrayList<String> getLines(){
        return lines;
    }
}
