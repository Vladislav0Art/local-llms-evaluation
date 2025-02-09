package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedValueOfWithoutSettingsTest {

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
    }

}