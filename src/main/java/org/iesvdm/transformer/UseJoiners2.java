package org.iesvdm.transformer;

import java.util.ArrayList;

public class UseJoiners2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        JoinByAdding joiner = new JoinByAdding();

        ArrayList<Integer> result = Joiners.zipArrayLists(joiner, list1, list2);

        System.out.println(result);
    }
}
