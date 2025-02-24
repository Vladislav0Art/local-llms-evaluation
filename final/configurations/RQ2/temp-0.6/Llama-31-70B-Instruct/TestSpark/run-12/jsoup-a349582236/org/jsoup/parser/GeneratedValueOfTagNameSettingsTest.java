package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValueOfTagNameSettingsTest {

    @Test
    public void valueOfTagNameSettingsTest() {
        String tagName = "tagName";
        ParseSettings settings = new ParseSettings();
        Tag expectedTag = new Tag();
        assertEquals(expectedTag, Tag.valueOf(tagName, settings));
    }

}