package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTd {

    @Test
    public void testTd() {
        assertEquals("<td>", Tag.valueOf("ul", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<td>", Tag.valueOf("ul", null).asString());
        assertEquals("<td>", Tag.valueOf(null, "div").asString());
    }

}