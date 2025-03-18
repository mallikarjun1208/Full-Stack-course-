package com.fullstack.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileExample {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("File writer Example ");
        System.out.println("Enter the file name: ");
        String name =sc.next();

        File file = new File(name);

        try(FileReader reader = new FileReader(file)){
            int c = reader.read();
            System.out.println("reading the file " +name);
            while(c==-1){
                System.out.println((char)c);
                c = reader.read();
            }
        }catch(IOException e){
            System.out.println("unable to read the file " +name);
        }
        sc.close();
    }

}


