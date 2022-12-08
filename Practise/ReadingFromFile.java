package Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args)  {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\untitled\\src\\mail.txt"));
            System.out.println(reader.readLine());
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
