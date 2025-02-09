package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedIsInlineTrueTest {

    @Test
    public void isInlineTrueTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

}