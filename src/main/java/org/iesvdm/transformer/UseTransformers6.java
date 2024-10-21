package org.iesvdm.transformer;

public class UseTransformers6 {

    public static void main(String[] args) {
        Transformer<String> helloAdder = new HelloAdder();
        Transformer<String> customAdder = new CustomAdder("Goodbye");

        System.out.println(helloAdder.transform("Alice"));
        System.out.println(customAdder.transform("Alice"));

        LispList<String> list = new LispList<>("Alice", "Bob", "Charlie");

        System.out.println(Transformers.transformList(helloAdder, list));

        System.out.println(Transformers.transformList(customAdder, list));
    }
}

