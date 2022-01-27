package farihaChowdhury;

import java.io.*;


public class PrintWriterDemo {

    public static void main(String[] args) {

            PrintWriter pw = new PrintWriter(System.out,true);
            pw.println("HELLOOOOOOOOO");
            int i = 8;
            pw.println(i);
            double d = 4.5;
            pw.println(d);


    }
}
