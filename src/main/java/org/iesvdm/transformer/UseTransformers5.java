package org.iesvdm.transformer;

public class UseTransformers5 {
    public static void main(String[] args) {
        Transformer<Integer> multiplier = new Transformer<Integer>() {
            @Override
            public Integer transform(Integer input) {
                return input * 2;
            }
        };

        LispList<Integer> list = LispList.of(1, 2, 3, 4, 5);

        LispList<Integer> transformedList = Transformers.transformList(multiplier, list);

        System.out.println(transformedList);
    }
}
