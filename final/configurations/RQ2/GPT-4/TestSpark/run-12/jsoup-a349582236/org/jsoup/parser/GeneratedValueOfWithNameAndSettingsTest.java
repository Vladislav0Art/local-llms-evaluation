package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithNameAndSettingsTest {

    @Test
    public void valueOfWithNameAndSettingsTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("div", settings);
        assertEquals("DIV", tag.normalName());
        assertEquals("DIV", tag.getName());
    }

}