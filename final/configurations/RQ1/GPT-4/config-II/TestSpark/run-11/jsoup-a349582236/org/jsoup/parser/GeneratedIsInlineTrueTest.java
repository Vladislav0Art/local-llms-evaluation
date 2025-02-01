package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTrueTest {

    @Test
    public void isInlineTrueTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

}