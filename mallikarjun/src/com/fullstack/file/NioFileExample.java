package com.fullstack.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NioFileExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Enter the new file ");
        String name = sc.next();

        if(name.indexOf(".txt")==-1){
            name += ".txt";
        }

        Path newPath = Paths.get(name);

        sc.nextLine();
        System.out.println("Enter the content in a file path:  ");

        String content = sc.nextLine();
        try{
            Files.write(newPath, content.getBytes());
            System.out.println("file has been written ");
        }
        catch(IOException e){
            System.out.println("unable write the file");

        }
    }

}
