package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestEm {

    @Test
    public void testEm() {
        assertEquals("em", Tag.valueOf(null, null));
        assertEquals("", Tag.parse("").value);
        assertEquals("em", Tag.valueOf("em", null));
        assertEquals("em", Tag.valueOf(null, "em"));
    }

}