package org.iesvdm.transformer;

public class JoinBySpace implements Joiner<String> {
    @Override
    public String join(String a, String b) {
        return a + " " + b;
    }
}
