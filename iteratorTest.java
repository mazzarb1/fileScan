/**
 * Created by brandonmazzarella on 6/2/17.
 */

//importing all the needed packages
import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class iteratorTest {
//IOException incase file not found
    public static void main(String[] args) throws IOException{

        //Creating a new String that will store the URLs.
        String url;
        Scanner fileScan, urlScan;

        //file scan is a scanner that will scan the file
        fileScan = new Scanner(new File("websites.txt"));

        //while there is more to be scanned
        while (fileScan.hasNext())
        {
            url = fileScan.nextLine();
            System.out.println("Url: " + url);

            //Url Scan scans the urls that are stored in url  and looks for delimiter and then breaks it up
            urlScan = new Scanner(url);
            urlScan.useDelimiter("/");

            while(urlScan.hasNext())
                System.out.println(urlScan.next());
            System.out.println();

        }




    }


}
