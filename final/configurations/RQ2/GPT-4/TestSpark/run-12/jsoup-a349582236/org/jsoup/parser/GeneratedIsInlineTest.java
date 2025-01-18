package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag inlineTag = Tag.valueOf("span");
        assertTrue(inlineTag.isInline());
        Tag nonInlineTag = Tag.valueOf("table");
        assertFalse(nonInlineTag.isInline());
    }

}