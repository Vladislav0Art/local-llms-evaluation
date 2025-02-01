package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag t = new Tag("div");
        assertTrue(t.isBlock());
    }

}