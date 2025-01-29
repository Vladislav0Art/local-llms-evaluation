package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestNormaliseWhitespaceWithMultipleSpaces {

    @Test
    public void testNormaliseWhitespaceWithMultipleSpaces() {
        String str1 = "Hello   World";
        String result1 = normaliseWhitespace(str1);
        System.out.println(result1); // Expected output: Hello World
    }

}