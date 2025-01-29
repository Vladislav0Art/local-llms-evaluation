package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestParseWithMultipleTags {

    @Test
    public void testParseWithMultipleTags() {
        String input = "<a><b>Hello</b> World!";
        assertEquals("Hello World!", Main.parseWithMultipleTags(input));
    }

}