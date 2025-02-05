package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertNotNull(tag);
        assertEquals("div", tag.getName());
    }

}