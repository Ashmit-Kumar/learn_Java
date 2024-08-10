package MultiThreading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaders {
    public static void main(String[] args) throws IOException {
        FileReader fr=null;
        try{
            int ch;
            fr=new FileReader("Output.txt");
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch(FileNotFoundException e){
           System.out.println(e.getMessage());
        }  
    }
}
