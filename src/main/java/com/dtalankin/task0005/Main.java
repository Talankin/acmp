/**
 *  27.12.2016
 *  Dmitry Talankin
 */

package com.dtalankin.task0005;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        int length = scanner.nextInt();
        int n, odd=0, even=0;
        List<Integer> array = new ArrayList<Integer>();

        if (length >=1 && length <= 100) {
            while (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n>=1 && n<=31) {
                    if (n%2 > 0) {
                        pw.print(n + " ");
                        odd++;
                    } else {
                        array.add(n);
                        even++;
                    }
                }
            }
        }

        pw.println();
        for (int e : array) {
            pw.print(e + " ");
        }
        pw.println();
        String nStr = (even >= odd)? "YES" : "NO";
        pw.print(nStr);
        pw.close();
    }
}
