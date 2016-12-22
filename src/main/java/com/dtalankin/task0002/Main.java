/**
 *  18.12.2016
 *  Dmitry Talankin
 */

package com.dtalankin.task0002;

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
        int sum = 0;
        if (n <= 0 && n >= -10000) {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        } else if (n > 0 && n <= 10000) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        pw.print(sum);
        pw.close();
    }
}
