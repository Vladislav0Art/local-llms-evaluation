package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}