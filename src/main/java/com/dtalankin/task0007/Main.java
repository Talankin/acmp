/**
 *  02.01.2017
 *  Dmitry Talankin
 */

package com.dtalankin.task0007;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
        BigDecimal bdA = new BigDecimal(scanner.next());
        BigDecimal bdB = new BigDecimal(scanner.next());
        BigDecimal bdC = new BigDecimal(scanner.next());

        if (isNumCorrect(bdA) && isNumCorrect(bdB) && isNumCorrect(bdC)) {
            pw.print(bdA.max(bdB).max(bdC));
        }

        pw.close();
    }

    private boolean isNumCorrect(BigDecimal bd) {
        final BigDecimal maxBound = new BigDecimal("1E100");
        final BigDecimal minBound = new BigDecimal("1");
        BigDecimal min = minBound.min(bd);
        BigDecimal max = maxBound.max(bd);
        return min.equals(minBound) && max.equals(maxBound);
    }
}
