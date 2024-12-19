package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTableCell {

    @Test
    public void testTableCell() {
        assertEquals("<th>", Tag.valueOf("li", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<th>", Tag.valueOf("li", null).asString());
        assertEquals("<th>", Tag.valueOf(null, "div").asString());
    }

}