package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("testTag", ParseSettings.preserveCase);
        assertNotNull(tag);
        assertEquals("testTag", tag.getName());
    }

}