package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineForInlineElementTest {

    @Test
    public void isInlineForInlineElementTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

}