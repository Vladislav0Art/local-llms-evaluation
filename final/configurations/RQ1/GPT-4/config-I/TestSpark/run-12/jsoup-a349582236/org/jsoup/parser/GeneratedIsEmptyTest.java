package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Tag t = Tag.valueOf("img");
        assertTrue(t.isEmpty());
    }

}