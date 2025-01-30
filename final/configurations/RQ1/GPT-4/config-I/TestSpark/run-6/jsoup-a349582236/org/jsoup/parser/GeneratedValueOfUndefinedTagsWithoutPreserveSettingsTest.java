package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfUndefinedTagsWithoutPreserveSettingsTest {

    @Test
    public void valueOfUndefinedTagsWithoutPreserveSettingsTest() {
        Tag tag = Tag.valueOf("AWESOMETAG", new ParseSettings(false, false));
        assertEquals("awesometag", tag.getName());
    }

}