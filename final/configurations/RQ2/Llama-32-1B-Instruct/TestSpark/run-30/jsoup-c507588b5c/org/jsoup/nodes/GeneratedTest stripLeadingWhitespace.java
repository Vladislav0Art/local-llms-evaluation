package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest stripLeadingWhitespace {

    @Test
    public void test

    stripLeadingWhitespace() {
        String text = "  Hello";
        StringBuilder sb = new StringBuilder();
        stripLeadingWhitespace(sb, text);
        assertEquals(10, sb.length());
    }

}