package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfStringAndParseSettingsTest {

    @Test
    public void valueOfStringAndParseSettingsTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.htmlDefault);
        assertNotNull(tag);
        assertEquals("p", tag.getName());
    }

}