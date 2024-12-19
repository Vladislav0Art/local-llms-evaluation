package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestStrong {

    @Test
    public void testStrong() {
        assertEquals("<strong>", Tag.valueOf("span", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<strong>", Tag.valueOf("span", null).asString());
        assertEquals("<strong>", Tag.valueOf(null, "div").asString());
    }

}