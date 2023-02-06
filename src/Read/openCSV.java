package Read;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class openCSV {
    private static ArrayList<String> lines;

    public static void setLines(String type) throws IOException {
        BufferedReader br = Files.newBufferedReader(Path.of(type+".csv"), StandardCharsets.US_ASCII);
         lines = new ArrayList<String>();
        String newLine;
        File f = new File("completed"+type+".csv");
        if(f.exists() && !f.isDirectory()){
           // System.out.println("present");
            while((newLine = br.readLine())!= null) {
                //System.out.println(newLine);
                lines.add(newLine);
            }
        }
        else {
           // System.out.println("nope");
            File file = new File("completed"+type+".csv");
            PrintWriter pw = new PrintWriter(file);
            while((newLine = br.readLine())!= null){
                pw.append(newLine+"\n");
                lines.add(newLine);
        }
            pw.close();

        }
    }

    public static void setCompleteLines(String type) throws IOException{
        BufferedReader br = Files.newBufferedReader(Path.of("completed"+type+".csv"), StandardCharsets.US_ASCII);
        lines = new ArrayList<String>();
        String newLine;
        while((newLine = br.readLine())!= null){
            lines.add(newLine);
        }
    }

    public static ArrayList<String> getLines(){
        return lines;
    }
}
