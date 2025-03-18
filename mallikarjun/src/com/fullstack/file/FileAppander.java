package com.fullstack.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppander {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("File writer Example ");
        System.out.println("Enter the file name: ");
        String name =sc.next();

        //creating a new file
        File file = new File(name);
        if(name.indexOf(".txt")==-1){
            name += ".txt";
        }
        

        sc.nextLine();

        System.out.println("enther the content of the file ");

        String  content=sc.nextLine();

        //writing content in a file

        try(FileWriter writer = new FileWriter(file,true)){
            writer.write(content);
            }
        catch(IOException e){
            System.out.println("unable to read the file " +name);
        }
        System.out.println("sucrssfully written the content "+file.getAbsolutePath());
        sc.close();
    }
}



