package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestStripLeadingWhitespaceWithMultipleSpaces {

    @Test
    public void testStripLeadingWhitespaceWithMultipleSpaces() {
        String str3 = "   Hello World";
        String result3 = stripLeadingWhitespace(str3);
        System.out.println(result3); // Expected output: Hello World
    }

}