package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfTagNameSettingsTest {

    @Test
    public void valueOfTagNameSettingsTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("tag1", settings);
        assertEquals("tag1", tag.getName());
    }

}