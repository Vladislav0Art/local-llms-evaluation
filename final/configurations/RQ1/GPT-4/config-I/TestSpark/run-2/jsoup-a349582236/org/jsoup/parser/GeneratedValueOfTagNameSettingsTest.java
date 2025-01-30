package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTagNameSettingsTest {

    @Test
    public void valueOfTagNameSettingsTest() {
        Tag tag = Tag.valueOf("body", ParseSettings.htmlDefault);
        assertNotNull(tag);
    }

}