package MultiThreading;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FileHandling {
    public static void main(String[] args) throws IOException{
        String str = "Hello This is new File "; 
        FileWriter fr=new FileWriter("Output.txt");
        FileReader fw=new FileReader("Output.txt");
        fr.write(str);
        int ch;
        while((ch=fw.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }
}
