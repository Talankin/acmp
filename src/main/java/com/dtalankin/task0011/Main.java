/**
 *  07.01.2017
 *  Dmitry Talankin
 */

package com.dtalankin.task0011;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        int k,n;
        k = scanner.nextInt();
        n = scanner.nextInt();
        List<Integer> array = new ArrayList<Integer>();


        if (k>0 && k<=n && n<=300) {
            for (int i = 0; i < n ; i++) {
                array.add(1);
            }

            int pos, count;
            for (int i = 0; i < array.size(); i++) {

                array.set(i, array.get(i) + 1);
                pos = 0;
//                for (int l = 1; l < array.size(); l++) {

//                    sort(array);
//                    pos++;
//                    count = pos - 1;

//                    if (i > 0) {
//                        Collections.rotate(array, count);
//                        System.out.println();
//                    }
                    for (int j = i; j < array.size(); j++) {
                        if (array.get(j) == 1) {
                            Collections.swap(array, j, j - 1);
                            System.out.println(j);
                        }
                    }
                sort(array);
                Collections.rotate(array, i);
                System.out.println();

//                }
            }
//            {
//                if (array.get(0) + 1 <= k) {
//                    array.remove(array.size()-1);
//                    array.set(0, array.get(0) + 1);
//                }
//                int sum = 0;
//                for (int i = 0; i < array.size(); i++) {
//                    sum+=array.get(i);
//                }
//                System.out.println(sum);
//            }
        }



        pw.print(k);
        pw.close();
    }

    private void sort(List<Integer> arr) {
        arr.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
    }

}
