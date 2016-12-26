/**
 *  26.12.2016
 *  Dmitry Talankin
 */

package com.dtalankin.task0004;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private PrintWriter pw;
    private Scanner scanner;

    public static void main(String[] args) throws IOException {
        new Main().calculate();
    }

    public void calculate() throws IOException {
        scanner = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        int n = scanner.nextInt();
        String nStr = "";

        if (n<10 && n>0) {
            nStr = n + "9" + (9-n);
        }

        pw.print(nStr);
        pw.close();
    }
}
