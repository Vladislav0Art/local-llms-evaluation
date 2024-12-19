package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestAlt {

    @Test
    public void testAlt() {
        assertEquals("<img src=\"image.jpg\">", Tag.valueOf("img", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<img src=\"image.jpg\">", Tag.valueOf("img", null).asString());
        assertEquals("<img src=\"image.jpg\">", Tag.valueOf(null, "div").asString());
    }

}