package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestMultipleTags {

    @Test
    public void testMultipleTags() {
        String input = "<a><b>Hello</b> World!";
        assertEquals("Hello World!", Main.parseWithMultipleTags(input));
    }

}