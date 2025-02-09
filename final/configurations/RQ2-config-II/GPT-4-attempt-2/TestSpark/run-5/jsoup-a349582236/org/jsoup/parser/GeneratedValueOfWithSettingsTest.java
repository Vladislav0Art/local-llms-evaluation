package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings(true, false);
        Tag tag = Tag.valueOf("div", settings);
        assertNotNull(tag);
    }

}