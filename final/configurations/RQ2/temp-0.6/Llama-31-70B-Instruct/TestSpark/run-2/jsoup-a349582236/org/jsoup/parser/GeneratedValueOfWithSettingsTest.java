package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag actual = Tag.valueOf(tagName, settings);
        assertNotNull(actual);
    }

}