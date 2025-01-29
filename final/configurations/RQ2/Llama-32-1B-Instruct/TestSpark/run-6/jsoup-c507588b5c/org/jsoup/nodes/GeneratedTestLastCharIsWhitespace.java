package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb1 = new StringBuilder("Hello World");
        String str1 = lastCharIsWhitespace(sb1);
        System.out.println(str1.equals("\n\r\n")); // Expected output: false
        String sb2 = new StringBuilder("   ");
        String str2 = lastCharIsWhitespace(sb2);
        System.out.println(str2.equals("\n\r\n")); // Expected output: true
    }

}