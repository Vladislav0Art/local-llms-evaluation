package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfUndefinedTagsWithPreserveSettingsTest {

    @Test
    public void valueOfUndefinedTagsWithPreserveSettingsTest() {
        Tag tag = Tag.valueOf("awesomeTag", new ParseSettings(true, true));
        assertEquals("awesomeTag", tag.getName());
    }

}