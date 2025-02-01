package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("p").preserveWhitespace());
    }

}