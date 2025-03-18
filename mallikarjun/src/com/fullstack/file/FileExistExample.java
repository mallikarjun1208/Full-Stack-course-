package com.fullstack.file;

import java.io.File;
import java.util.Scanner;

public class FileExistExample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== ");
        System.out.println("File exist example ");
        System.out.println("Enter the the file name ");
        String name = sc.next();

        File file = new File(name);

        boolean fileFound = file.exists();
        String out = "File "+name + " " +(fileFound?  "" : "Not")  +"found";
        System.out.println(out);
        
    }
}
