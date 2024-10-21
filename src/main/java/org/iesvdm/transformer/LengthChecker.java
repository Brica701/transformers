package org.iesvdm.transformer;

public class LengthChecker implements Checker<String> {
    private final int maxLength;

    public LengthChecker(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean check(String obj) {
        return obj.length() < maxLength;
    }
}

