package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedValueOfTagAndSettingsTest {

    @Test
    public void valueOfTagAndSettingsTest() {
        Tag tag = Tag.valueOf("A", ParseSettings.preserveCase);
        assertEquals("A", tag.getName());
    }

}