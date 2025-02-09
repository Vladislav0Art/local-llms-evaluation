package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithTagAndSettingsTest {

    @Test
    public void valueOfWithTagAndSettingsTest() {
        ParseSettings ps = ParseSettings.htmlDefault;
        Tag tag = Tag.valueOf("span", ps);
        assertNotNull(tag);
        assertEquals("span", tag.getName());
    }

}