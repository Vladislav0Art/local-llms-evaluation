package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTagWithSettingsTest {

    @Test
    public void valueOfTagWithSettingsTest() {
        Tag testTag = Tag.valueOf("test", ParseSettings.preserveCase);
        assertEquals("test", testTag.getName());
    }

}