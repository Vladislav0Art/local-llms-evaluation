package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineBlockTagTest {

    @Test
    public void isInlineBlockTagTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isInline());
    }

}