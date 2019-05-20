import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        int k1 = 2;
        int k2 = 9;
        newFile( k1, k2);
    }

    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("file1.txt");

        for(int i = k1; i <= k2; i++) {

            nFile.write(i+"\n");

        }

        nFile.write("В недрах тундры \nВыдры в гетрах \nТырят в ведра \nЯдра кедров");

        nFile.close();
        FileReader fr= new FileReader("file1.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }

        fr.close();
    }
}