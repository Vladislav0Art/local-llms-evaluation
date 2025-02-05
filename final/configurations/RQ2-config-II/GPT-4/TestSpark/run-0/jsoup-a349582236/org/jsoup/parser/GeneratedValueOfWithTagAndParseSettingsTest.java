package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValueOfWithTagAndParseSettingsTest {

    @Test
    public void valueOfWithTagAndParseSettingsTest() {
        Tag tag = Tag.valueOf("DIV", new ParseSettings(true, true));
        assertEquals("DIV", tag.getName());
    }

}