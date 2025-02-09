package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValueOfWithTagNameTest {

    @Test
    public void valueOfWithTagNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

}