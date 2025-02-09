package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceRemovesLeadingSpaces {

    @Test
    public void stripLeadingWhitespaceRemovesLeadingSpaces() {
        String textWithLeadingWhitespaces = "   Hello World!";
        String expected = "Hello World!";
        assertSame(expected, StringUtil.stripLeadingWhitespace(textWithLeadingWhitespaces));
    }
}

class StringUtil {

    public static String stripLeadingWhitespace(String text) {
        int i = 0;
        while (i < text.length() && Character.isWhitespace(text.charAt(i))) {
            i++;
        }
        return text.substring(i);
    }

}