package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

public class GeneratedTest forEach {

    @Test
    public void test

    forEach() {
        // Test forEach method
        String text = "Hello, World!";
        int index = 0;
        forEach(text, (Element) -> System.out.println("Found at index " + index++));
        // Output:
        // Found at index 0

        Set<String> classNames1 = getElementsByTag("tag");
        int count = classNames1.size();
        for (int i = 0; i < count; i++) {
            System.out.println(classNames1.get(i) + ": " + i);
        }
    }

}