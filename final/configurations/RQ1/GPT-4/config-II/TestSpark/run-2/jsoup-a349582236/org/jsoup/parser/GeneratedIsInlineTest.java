package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        assertTrue(Tag.valueOf("img").isInline());
        assertFalse(Tag.valueOf("p").isInline());
    }

}