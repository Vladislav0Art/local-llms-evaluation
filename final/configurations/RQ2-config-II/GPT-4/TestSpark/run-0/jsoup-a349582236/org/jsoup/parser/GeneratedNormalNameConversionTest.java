package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNormalNameConversionTest {

    @Test
    public void normalNameConversionTest() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.normalName());
    }

}