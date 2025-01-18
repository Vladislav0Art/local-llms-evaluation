package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("custom-tag"));
    }

}