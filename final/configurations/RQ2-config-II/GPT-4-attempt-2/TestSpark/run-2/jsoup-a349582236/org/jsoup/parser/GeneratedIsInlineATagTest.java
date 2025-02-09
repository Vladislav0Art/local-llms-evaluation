package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineATagTest {

    @Test
    public void isInlineATagTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

}