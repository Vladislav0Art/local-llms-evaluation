package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTbody {

    @Test
    public void testTbody() {
        assertEquals("<tbody>", Tag.valueOf("ul", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<tbody>", Tag.valueOf("ul", null).asString());
        assertEquals("<tbody>", Tag.valueOf(null, "div").asString());
    }

}