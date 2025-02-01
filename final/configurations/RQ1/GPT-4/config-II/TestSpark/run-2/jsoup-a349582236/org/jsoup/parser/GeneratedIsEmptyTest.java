package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertFalse(Tag.valueOf("p").isEmpty());
    }

}