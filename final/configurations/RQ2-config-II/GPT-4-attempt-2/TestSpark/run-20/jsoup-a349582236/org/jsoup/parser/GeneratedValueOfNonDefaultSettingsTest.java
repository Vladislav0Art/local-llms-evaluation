package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedValueOfNonDefaultSettingsTest {

    @Test
    public void valueOfNonDefaultSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertTrue(tag.isBlock());
    }

}