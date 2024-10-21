package org.iesvdm.transformer;

public class CustomGreetingAdder implements Transformer<String> {
    private String greeting;

    public CustomGreetingAdder(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String transform(String str) {
        return greeting + " " + str;
    }
}
