package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsBlockTrueTest {

    @Test
    public void isBlockTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

}