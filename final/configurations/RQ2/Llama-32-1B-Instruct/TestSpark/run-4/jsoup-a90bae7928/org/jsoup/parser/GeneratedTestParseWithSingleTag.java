package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestParseWithSingleTag {

    @Test
    public void testParseWithSingleTag() {
        String input = "<a>";
        assertEquals("a", Main.parse(input));
    }

}