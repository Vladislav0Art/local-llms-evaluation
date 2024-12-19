package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestBdo {

    @Test
    public void testBdo() {
        assertEquals("<b><u>", Tag.valueOf("p", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<b><u>", Tag.valueOf("p", null).asString());
        assertEquals("<b><u>", Tag.valueOf(null, "div").asString());
    }

}