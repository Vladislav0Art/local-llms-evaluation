package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestBlockquote {

    @Test
    public void testBlockquote() {
        assertEquals("<q>", Tag.valueOf("p", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<q>", Tag.valueOf("p", null).asString());
        assertEquals("<q>", Tag.valueOf(null, "div").asString());
    }

}