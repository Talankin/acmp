/**
 *  03.01.2017
 *  Dmitry Talankin
 */

package com.dtalankin.task0008;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private PrintWriter pw;
    private Scanner scanner;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    public void run() throws IOException {
        scanner = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String strOut = "";

        if (a <= 100 && b <= 100 && c <= 1000000) {
            strOut = (a*b)==c ? "YES" : "NO";
        }

        pw.print(strOut);
        pw.close();
    }
}
