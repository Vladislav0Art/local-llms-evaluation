package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestI {

    @Test
    public void testI() {
        assertEquals("i", Tag.valueOf(null, null));
        assertEquals("", Tag.parse("").value);
        assertEquals("i", Tag.valueOf("i", null));
        assertEquals("i", Tag.valueOf(null, "i"));
    }

}