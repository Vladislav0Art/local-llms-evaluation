package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsBlock_DefaultTagTest {

    @Test
    public void isBlock_DefaultTagTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}