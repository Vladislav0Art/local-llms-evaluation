package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.normalName());
    }

}