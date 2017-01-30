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

        int a, n;
        a = scanner.nextInt();
        n = scanner.nextInt();
        List<Integer> array = new ArrayList<Integer>();


        if (a>0 && a<=n && n<=300) {
            for (int i = 0; i < n ; i++) {
                array.add(1);
            }

            firstLoop(array, a);

//
//            int pos, count=5, i=0, j;
////            for (int i = 0; i < array.size(); i++) {
//            while (i < array.size()) {
//                //loop to increment and check sum of elements
////                int size = array.size();
//
//                if (count == 1) {
//                    sort(array);
//                }
//                array.set(i, array.get(i) + 1);
//                array.remove(array.size()-1);
//                count -= 2;
//                pos = 0;
//                j = 0;
//                while(j < count) {
////                for (int j = 1; j < array.size(); j++) {
//                    //loop to move blocks of numbers
//
//
//                    System.out.println();
//                    for (int k = i+1; k < array.size(); k++) {
//                        //loop to move an element in blocks
//                        if (array.get(k) == 1) {
//                            Collections.swap(array, k, k - 1);
//                            System.out.println();
//                        }
//                    }
//                    sort(array);
//                    if (i==0) break;
//                    Collections.rotate(array, count);
//                    System.out.println();
//                    j++;
//                }
//                i++;
//            }
        }

        pw.print(a);
        pw.close();
    }

    private void sort(List<Integer> arr) {
        arr.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
    }

    private void firstLoop(List<Integer> array, int a) {
        int j, count=array.size();
        for (int i = 0; i < array.size(); i++) {
            //loop to increment and check sum of elements
            sort(array);
            array.set(i, array.get(i) + 1);
            array.remove(array.size() - 1);
//            count -= 2;
            count = array.size()-i-1;
            j = i;
            while(j <= count) {
                //loop to move blocks of numbers
                System.out.println();
                secondLoop(array, j);
                if (j==0) break;
                System.out.println();
                j++;
            }
        }
    }

    private void secondLoop(List<Integer> array, int i) {
        for (int k = i+1; k < array.size(); k++) {
            //loop to move an element in blocks
            if (array.get(k) == 1) {
                Collections.swap(array, k, k - 1);
                System.out.println();
            }
        }
        sort(array);
        Collections.rotate(array, i);
        System.out.println();
    }

    private void thirdLoop(List<Integer> array) {

        for (int i = 0; i < array.size(); i++) {

        }
//        Collections.rotate(array, count);


    }

}
