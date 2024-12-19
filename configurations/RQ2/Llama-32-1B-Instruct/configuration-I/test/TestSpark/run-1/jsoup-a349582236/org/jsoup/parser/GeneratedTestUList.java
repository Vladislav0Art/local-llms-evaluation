package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestUList {

    @Test
    public void testUList() {
        assertEquals("<ul>", Tag.valueOf("li", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<ul>", Tag.valueOf("li", null).asString());
        assertEquals("<ul>", Tag.valueOf(null, "div").asString());
    }

}