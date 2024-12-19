package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestS {

    @Test
    public void testS() {
        assertEquals("s", Tag.valueOf(null, null));
        assertEquals("", Tag.parse("").value);
        assertEquals("s", Tag.valueOf("s", null));
        assertEquals("s", Tag.valueOf(null, "s"));
    }

}