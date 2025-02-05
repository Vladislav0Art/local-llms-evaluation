package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOf_WithSettingsTest {

    @Test
    public void valueOf_WithSettingsTest() {
        ParseSettings parseSettings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("tagName", parseSettings);
        assertEquals("TAGNAME", tag.getName());
    }

}