package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockBlockTagTest {

    @Test
    public void isBlockBlockTagTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

}