package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfStringTagParseSettingsTest {

    @Test
    public void valueOfStringTagParseSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertTrue(tag instanceof Tag);
    }

}