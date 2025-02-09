package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTestWithSettings {

    @Test
    public void valueOfTestWithSettings() {
        Tag tag = Tag.valueOf("P", ParseSettings.htmlDefault);
        assertNotNull(tag);
        assertTrue(tag.isKnownTag());
    }

}