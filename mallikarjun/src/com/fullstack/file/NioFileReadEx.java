package com.fullstack.file;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class NioFileReadEx {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Enter the new file: ");
        String name = sc.next();

        Path newPath = Paths.get(name);

        sc.nextLine();
        System.out.println("Enter the content in a file path:  ");

       
        try{
            List<String> lines = Files.readAllLines(newPath);
            System.out.println("content file is reading" );

            System.out.println(lines);
        }
        catch(IOException e){
            System.out.println("unable read the file");

        }
    }

}
