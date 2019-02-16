import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File fileOne = new File("File.txt");
            File fileTwo = new File("Тупо копия.txt");
            PrintWriter pw = new PrintWriter(fileOne);
            PrintWriter pw2 = new PrintWriter(fileTwo);
            BufferedReader br = null;

            Scanner s = new Scanner(System.in);
            String text = s.next();
            pw.print(text);
            pw.println(" Вот так вот");
            pw.println(" Ага");
            pw.close();

            br = new BufferedReader(new FileReader("File.txt"));
            String line;

            while((line = br.readLine())!=null){
                pw2.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
