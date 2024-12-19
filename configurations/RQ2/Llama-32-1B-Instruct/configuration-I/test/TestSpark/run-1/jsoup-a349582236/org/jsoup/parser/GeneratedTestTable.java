package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTable {

    @Test
    public void testTable() {
        assertEquals("<table>", Tag.valueOf("ul", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<table>", Tag.valueOf("ul", null).asString());
        assertEquals("<table>", Tag.valueOf(null, "div").asString());
    }

}