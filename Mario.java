package com.Harmon.Mario;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

/*
 * The hash and square results make a box, so we check to see if the columns and rows
 * square up
 */

public class Mario {

    private int n, output, rec; //// user input variable
    private int columns = 0; /// columns
    private int rows = 0; /// rows

    private File file;
    private PrintWriter p;

    public Mario() {
            ///// prompt user and collect user input ///////
           do {
                System.out.println("Please enter an integer between 0 - 24");

                Scanner scanner = new Scanner(System.in); /// get user input from scanner
                n = scanner.nextInt(); /// convert input to an integer

                System.out.println("Enter 1 to see result in the console or 2 to see result in a text");
                output = scanner.nextInt();

               try {
                   File file = new File("harmon.txt");
                   file.createNewFile();
                   p = new PrintWriter(new FileWriter(file));
               }catch(IOException e){ e.printStackTrace(); }
            }

            /// checking for correct value between 0 - 24 ///////
            while
                    (n <= 0 || n >= 24);
            /// when the user enters the correct input value //////
            for (rows = 1; rows <= n; rows++) { // if the rows are less than the user input then keep adding 1
                for (columns = 1; columns <= n; columns++) { // if the columns ar less than user input(n) add 1
                    if (columns >= n + 1 - rows) {
                        System.out.print("#");/// print hashes when applicable
                        p.print("#");
                    } else {
                        System.out.print(" "); /// print spaces when applicable
                        p.print(" ");
                    }
                }
                System.out.print("\n");
                p.println();
            }
        p.close();
        }

    public static void main(String[] args) {
        new Mario();
    }

}
