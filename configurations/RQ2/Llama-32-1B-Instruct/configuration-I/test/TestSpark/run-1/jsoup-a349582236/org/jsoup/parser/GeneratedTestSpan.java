package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestSpan {

    @Test
    public void testSpan() {
        assertEquals("span", Tag.valueOf(null, null));
        assertEquals("", Tag.parse("").value);
        assertEquals("span", Tag.valueOf("span", null));
        assertEquals("span", Tag.valueOf(null, "span"));
    }

}