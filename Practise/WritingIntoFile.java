package Practise;
// Best way to write into a file
//Use BufferedWriter to write into a file

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingIntoFile {
    public static void main(String[] args) {
        String[] users = {"Tilak", "Vijay", "Siva", "Shuieb", "Mahesh", "Virat"};
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\untitled\\src\\randomtext.txt"));
            writer.write("I am writing this text through a java program");
            /*Writing the users array list in to a file using for each loop
            * the users array list is specified in the program*/
            for (String user : users){
                writer.write("\n" + user);
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
