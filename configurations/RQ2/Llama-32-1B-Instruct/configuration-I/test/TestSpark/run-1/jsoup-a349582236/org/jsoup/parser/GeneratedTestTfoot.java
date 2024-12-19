package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTfoot {

    @Test
    public void testTfoot() {
        assertEquals("<tfoot>", Tag.valueOf("li", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<tfoot>", Tag.valueOf("li", null).asString());
        assertEquals("<tfoot>", Tag.valueOf(null, "div").asString());
    }

}