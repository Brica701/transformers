package org.iesvdm.transformer;

public class CustomAdder implements Transformer<String> {
    private String greeting;

    public CustomAdder(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String transform(String str) {
        return greeting + " " + str;
    }
}

