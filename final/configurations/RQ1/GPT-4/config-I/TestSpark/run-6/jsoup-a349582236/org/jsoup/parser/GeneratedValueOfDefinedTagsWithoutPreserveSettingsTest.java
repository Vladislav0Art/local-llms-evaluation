package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfDefinedTagsWithoutPreserveSettingsTest {

    @Test
    public void valueOfDefinedTagsWithoutPreserveSettingsTest() {
        Tag tag = Tag.valueOf("P", new ParseSettings(false, false));
        assertEquals("p", tag.getName());
    }

}