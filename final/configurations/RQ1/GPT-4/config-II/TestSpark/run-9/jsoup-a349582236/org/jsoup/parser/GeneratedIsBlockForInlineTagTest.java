package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockForInlineTagTest {

    @Test
    public void isBlockForInlineTagTest() {
        Tag tag = Tag.valueOf("a");
        assertFalse(tag.isBlock());
    }

}