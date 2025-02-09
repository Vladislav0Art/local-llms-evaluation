package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsInlineValidInputTest {

    @Test
    public void isInlineValidInputTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

}