package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

}