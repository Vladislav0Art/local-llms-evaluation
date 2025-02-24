package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTagNameSettingsTest {

    @Test
    public void valueOfTagNameSettingsTest() {
        ParseSettings settings = new ParseSettings(false, false);
        Tag tag = Tag.valueOf("test", settings);
        assertEquals("test", tag.getName());
    }

}