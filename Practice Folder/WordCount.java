import java.util.Scanner;
import java.io.*;

public class WordCount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        File inputFile = new File("file.txt");
        int wordCount =0;
        try{
            Scanner in = new Scanner(new FileInputStream(inputFile));
            in.useDelimiter("[^A-Za-z]+");
            while(in.hasNext())
            {
                System.out.println(in.next());
                wordCount++;
            }
            
        }
        catch(FileNotFoundException e)
        {
            //poop 
        }
        System.out.println("wordcount: " +wordCount);
        
    }

}
