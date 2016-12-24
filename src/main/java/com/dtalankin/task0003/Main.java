/**
 *  24.12.2016
 *  Dmitry Talankin
 */

package com.dtalankin.task0003;

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
        long n = scanner.nextLong();
        String nStr = String.valueOf(n);
        int index = nStr.lastIndexOf("5");

        if (n>=0 && n<=400000 && index>-1) {
            n*=n;
        } else {
            n = 0;
        }

        pw.print(n);
        pw.close();
    }
}
