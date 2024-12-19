package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestDiv {

    @Test
    public void testDiv() {
        assertEquals("div", Tag.valueOf(null, null));
        assertEquals("", Tag.parse("").value);
        assertEquals("div", Tag.valueOf("div", null));
        assertEquals("div", Tag.valueOf(null, "div"));
    }

}