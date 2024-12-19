package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestParagraph {

    @Test
    public void testParagraph() {
        assertEquals("<p>", Tag.valueOf("span", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<p>", Tag.valueOf("span", null).asString());
        assertEquals("<p>", Tag.valueOf(null, "div").asString());
    }

}