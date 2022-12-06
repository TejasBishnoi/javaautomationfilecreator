import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static boolean go = true;
    public static String filename;
    public static void main(String[] args) {
        try {
            // create new file called sample in "d" drive
            File file = new File("open.bat");
            FileOutputStream fos = new FileOutputStream(file);

            // write some commands to the file
            DataOutputStream dos = new DataOutputStream(fos);
            Scanner scanner = new Scanner(System.in);
            System.out.println("MADE BY TEJAS BISHNOI");
            System.out.println("Enter The name of the program with extension name eg. example.exe/cmd/bat :");
            filename =  scanner.nextLine();
            dos.writeBytes("OPEN="+filename);
            dos.close();
        } catch (Exception ex) {
        }
    }

}