package org.iesvdm.transformer;

public class OddChecker implements Checker<Integer> {
    @Override
    public boolean check(Integer obj) {
        return obj % 2 != 0;
    }
}
