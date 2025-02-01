package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        assertTrue(Tag.valueOf("p").isBlock());
        assertFalse(Tag.valueOf("img").isBlock());
    }

}