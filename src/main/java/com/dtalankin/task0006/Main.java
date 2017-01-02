/**
 *  01.01.2017
 *  Dmitry Talankin
 */

package com.dtalankin.task0006;

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
        String str = scanner.next();
        String strOut = "ERROR";

        if (str.trim().length() == 5) {
            String[] splitArr = str.split("-");
            if (splitArr.length == 2) {
                try {
                    int startPlaceLetter = (int)splitArr[0].charAt(0);
                    int endPlaceLetter = (int)splitArr[1].charAt(0);
                    int startPlaceNum = Integer.parseInt(splitArr[0].substring(1));
                    int endPlaceNum = Integer.parseInt(splitArr[1].substring(1));
                    if (isCoordinateCorrect(startPlaceLetter, startPlaceNum)
                            && isCoordinateCorrect(endPlaceLetter, endPlaceNum)) {
                        if ((Math.abs(endPlaceLetter-startPlaceLetter)==2
                                && Math.abs(endPlaceNum-startPlaceNum)==1)
                            || (Math.abs(endPlaceLetter-startPlaceLetter)==1
                                && Math.abs(endPlaceNum-startPlaceNum)==2)) {
                            strOut = "YES";
                        } else {
                            strOut = "NO";
                        }
                    }
                } catch (NumberFormatException e) {
                }
            }
        }

        pw.print(strOut);
        pw.close();
    }

    private boolean isCoordinateCorrect(int first, int second) {
        if (first < 65 || first > 104
                || (first > 72 && first < 97)) {
            return false;
        }

        if (second < 1 || second > 8) {
            return false;
        }
        return true;
    }
}
