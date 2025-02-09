package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

}