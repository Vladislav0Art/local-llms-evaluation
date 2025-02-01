package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockForBlockTagTest {

    @Test
    public void isBlockForBlockTagTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isBlock());
    }

}