package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestOL {

    @Test
    public void testOL() {
        assertEquals("<ol>", Tag.valueOf("ul", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<ol>", Tag.valueOf("ul", null).asString());
        assertEquals("<ol>", Tag.valueOf(null, "div").asString());
    }

}