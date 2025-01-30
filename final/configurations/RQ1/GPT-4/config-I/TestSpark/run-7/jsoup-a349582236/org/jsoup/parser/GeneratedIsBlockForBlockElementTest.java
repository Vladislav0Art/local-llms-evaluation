package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockForBlockElementTest {

    @Test
    public void isBlockForBlockElementTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}