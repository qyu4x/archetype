package com.qyu4x.qq.hackerrank;


import java.util.ArrayList;
import java.util.List;

class ResultDrawingBook {
    public  int pageCount(int n, int p) {
        int page = 0;

        List<List<Integer>> bookPage = new ArrayList<>();
        List<Integer> tempPageLast = new ArrayList<>();
        List<Integer> tempPageOne = new ArrayList<>();

        tempPageOne.add(1);
        tempPageLast.add(n);
        bookPage.add(tempPageOne);
        for (int i = 2; i < n; i += 2) {
            List<Integer> tempPage = new ArrayList<>();
            tempPage.add(i);
            tempPage.add(i+1);
            bookPage.add(tempPage);
        }
       if (n % 2 == 0) {
           bookPage.add(tempPageLast);
       }

        int evenly = (bookPage.size()/2) * 2;
        for (int i = 0; i < bookPage.size(); i++) {
            if (p >= evenly) {
                for (int j = 0; j < bookPage.get(bookPage.size()-1-i).size(); j++){
                    int now = bookPage.get(bookPage.size()-1-i).get(j);
                    if (now == p) {
                        page = i;
                    }
                }
            } else {
                for (int j = 0; j < bookPage.get(i).size(); j++){
                    int now = bookPage.get(i).get(j);
                    if (now == p) {
                        page = i;
                    }
                }
            }
        }

        return page;
    }
}

public class DrawingBook {
    public static void main(String[] args) {

        ResultDrawingBook resultDrawingBook = new ResultDrawingBook();
        int result = resultDrawingBook.pageCount(5, 3);
        System.out.println(result);


    }
}
