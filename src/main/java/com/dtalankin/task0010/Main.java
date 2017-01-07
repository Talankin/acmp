/**
 *  06.01.2017
 *  Dmitry Talankin
 */

package com.dtalankin.task0010;

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

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        if (Math.abs(a) < 32768
                && Math.abs(b) < 32768
                && Math.abs(c) < 32768
                && Math.abs(d) < 32768) {
            for (int x = -100; x <= 100 ; x++) {
                if ((a*x*x*x + b*x*x + c*x + d) == 0) {
                    pw.print(x + " ");
                }
            }
        }

        pw.close();
    }
}
