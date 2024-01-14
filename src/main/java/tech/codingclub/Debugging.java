package tech.codingclub;

import java.io.*;
import java.util.Date;

public class Debugging {
    public static void main(String[] args) throws IOException {
        int n=10;
        int sum=0;
//  Sum of all natural Number Till a number N
    for(int i=0;i<=n;i++){
        sum+=i;
    }

            Singleton singleton=Singleton.getSingletonInstance(456);
        Singleton singletonSecond=Singleton.getSingletonInstance(456);
        System.out.println("Sum till N Number :"+sum);
        System.out.println(new Date().toString());
        System.out.println(singleton.data+ sum);
        int x=sum;
        int y=45;
        int z=(x+y);
        System.out.println(z+" must be 100");

        // Open the file
        FileInputStream fStream = new FileInputStream("C:\\Users\\patta\\IdeaProjects\\TechCodingMafia\\src\\main\\java\\tech\\codingclub\\Debugging.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(fStream));

        String strLine;

//Read File Line By Line
        while (true)   {
            try {
                if ((strLine = br.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            // Print the content on the console - do what you want to do
            System.out.println (strLine);
        }

//Close the input stream
        fStream.close();

    }
}
