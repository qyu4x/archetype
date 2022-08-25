package com.qyu4x.qq.hackerrank;

import java.util.ArrayList;
import java.util.List;

class ResultListingNumber {
    public List<Integer> listingNumeber(List<Integer> ls) {

        List<Integer> ll = new ArrayList<>();
        List<Integer> bc = new ArrayList<>();

        if (!ll.iterator().hasNext()) {
            ll.add(ls.get(0));
            bc.add(ll.get(0));
        }

        int n = 0;
        for (int i = 1; i < ls.size(); i++) {
            for (int j = 0; j < ll.size(); j++) {
                if (ll.get(j).equals(ls.get(i))) {
                    continue;
                } else {
                    n++;
                    boolean sst = true;
                    int nx = i;
                    for (int z = 0; z < bc.size(); z++) {
                        if (bc.get(z).equals(ls.get(nx))) {
                            n--;
                            sst = false;
                            break;
                        }
                    }

                    if (sst) {
                        ll.add(n, ls.get(nx));
                        bc.add(ls.get(nx));
                    }
                }
            }
        }

        return ll;
    }
}

public class ListingNumber {
    public static void main(String[] args) {
        ResultListingNumber rln= new ResultListingNumber();

        var rs = rln.listingNumeber(List.of(2,2,2,8,8,8,8,8,4,4,4,4,10,2,2,2,2,6,6,6,6,6,2,2,2,2,2,2));
        for (var r : rs) {
            System.out.print(r + " ");
        }
    }
}
