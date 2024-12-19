package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestUmlaut {

    @Test
    public void testUmlaut() {
        assertEquals("\\u00e4", Tag.valueOf("span", null).asString().replaceAll("[\\u0000-\\uD7FF]", ""));
        assertEquals("\\n", Tag.parse("").value);
        assertEquals("\\n", Tag.valueOf(null, "div").asString().replaceAll("[\\u0000-\\uD7FF]", ""));
    }

}