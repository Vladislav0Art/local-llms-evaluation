package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestP {

    @Test
    public void testP() {
        assertEquals("p", Tag.valueOf(null, null));
        assertEquals("", Tag.parse("").value);
        assertEquals("p", Tag.valueOf("p", null));
        assertEquals("p", Tag.valueOf(null, "p"));
    }

}