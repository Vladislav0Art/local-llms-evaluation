package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTableRow {

    @Test
    public void testTableRow() {
        assertEquals("<tr>", Tag.valueOf("li", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<tr>", Tag.valueOf("li", null).asString());
        assertEquals("<tr>", Tag.valueOf(null, "div").asString());
    }

}