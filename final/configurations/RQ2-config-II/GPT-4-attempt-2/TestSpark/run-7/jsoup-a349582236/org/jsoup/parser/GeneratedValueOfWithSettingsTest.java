package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("DIV", settings);
        assertEquals("DIV", tag.getName());
    }

}