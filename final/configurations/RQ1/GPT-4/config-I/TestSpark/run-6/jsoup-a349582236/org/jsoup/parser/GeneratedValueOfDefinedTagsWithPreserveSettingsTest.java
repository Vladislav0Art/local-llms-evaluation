package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfDefinedTagsWithPreserveSettingsTest {

    @Test
    public void valueOfDefinedTagsWithPreserveSettingsTest() {
        Tag tag = Tag.valueOf("p", new ParseSettings(true, true));
        assertEquals("P", tag.getName());
    }

}