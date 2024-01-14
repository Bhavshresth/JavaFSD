package tech.codingclub.Utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileUtility {
//    Create a File and return the result in true or false
    public static boolean createFile(String FileNameWithPath){
         File file=new File(FileNameWithPath);
         boolean fileCreated=false;
         try {
             fileCreated= file.createNewFile();
         }
         catch(IOException e){
             e.printStackTrace();
         }
         return fileCreated;
    }

    //Used to read a file data and represent it in the arrayList format in the given order
    public static ArrayList<String> readFile(String fileName) {

        Scanner sc=null;
        ArrayList<String> str=new ArrayList<String>();
        try {
            File file =new File(fileName);
            sc=new Scanner(file);
            while (sc.hasNext()) {
                String Line=sc.nextLine();
//                System.out.println(Line);
                str.add(Line);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            if(sc!=null){
//                Closing a file is very Important
                sc.close();
            }
        }
        return str;
    }
    //Used to create a file and append statements to the file given
    public static boolean writeToFile(String fileNameWithPath,String content){
       /* try{
                    FileWriter fileWriter =new FileWriter(fileNameWithPath);
                    fileWriter.append(content);
                    fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }*/
        BufferedWriter bw = null;
        try {
            File file = new File(fileNameWithPath);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            bw.write(content);

        } catch (Exception e) {
            return false;
        } finally {

            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }


    //Used to append a file created wrt the contents given by the used
    public static boolean appendToFile(String fileName,String content) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append("\n");
            fileWriter.append(content);
            fileWriter.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Running FileUtility at "+ new Date().toString());
        //Name of the file and the whole Line of the Path of the file
        String namePathOfNewFile="C:\\Users\\patta\\IdeaProjects\\TechCodingMafia\\data\\practice\\file\\"+ "write-file.txt";
        //A File is created in the Given Location
        boolean created=createFile(namePathOfNewFile);
        //If a new file is created Return True or else false
        System.out.println("File Created :"+ created);

        //To print each lines of the file present in the .txt file
        ArrayList<String> row= readFile(namePathOfNewFile);
        for(String x: row){
            System.out.println("Line : "+ x);
        }
        //To print the length and size of the file
        System.out.println("Number of Line in the File : "+ row.size());


        //This fuction is created to create a file and write contect in the created file
        boolean wroteToFile=writeToFile(namePathOfNewFile,"This file is Generated on Bhavshresth System Automatically");
        //Used to print true if the file ir written and created or not
        System.out.println(wroteToFile);

        //This append function is used to create string in the present file location using filewritter function or class
        for(int i=1;i<=100;i++){
            String data=i+" ";
            appendToFile(namePathOfNewFile,data);
        }
        //Used to append the file in the class and fuction
        boolean append=appendToFile(namePathOfNewFile,"Hey EveryOne");

    }
}
