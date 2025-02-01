package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosingTest {

    @Test
    public void isSelfClosingTest() {
        assertTrue(Tag.valueOf("img").isSelfClosing());
        assertFalse(Tag.valueOf("p").isSelfClosing());
    }

}