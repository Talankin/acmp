/**
 *  05.01.2017
 *  Dmitry Talankin
 */

package com.dtalankin.task0009;

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
        new Main().run();
    }

    public void run() throws IOException {
        scanner = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));

        int length = scanner.nextInt();
        int n, sum=0, min = 0, max = 0, mult;
        List<Integer> array = new ArrayList<Integer>();

        if (length >=1 && length <= 100) {
            while (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (Math.abs(n) <= 100) {
                    array.add(n);
                    if (n < min) {
                        min = n;
                    }
                    if (n > max) {
                        max = n;
                    }

                    if (n > 0) {
                        sum+=n;
                    }
                }
            }
        }

        boolean flag = false;
        mult = 1;
        for (int e : array) {
            if ((e == min || e == max) && !flag) {
                flag = true;
            } else if ((e == min || e == max)) {
                break;
            }

            if (flag && e!=min && e!=max) {
                mult *= e;
            }
        }

        sum = (sum > 30000) ? 0 : sum;
        mult = (mult > 30000) ? 0 : mult;
        pw.print(sum + " " + mult);
        pw.close();
    }
}
