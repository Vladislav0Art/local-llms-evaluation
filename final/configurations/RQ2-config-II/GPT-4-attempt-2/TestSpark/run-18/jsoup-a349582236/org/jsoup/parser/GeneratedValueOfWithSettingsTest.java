package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings setting = new ParseSettings(true, false);
        Tag tag = Tag.valueOf("p", setting);
        assertEquals("P", tag.getName());
    }

}