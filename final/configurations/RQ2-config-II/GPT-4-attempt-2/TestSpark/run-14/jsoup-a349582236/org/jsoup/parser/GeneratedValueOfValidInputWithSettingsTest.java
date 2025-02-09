package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfValidInputWithSettingsTest {

    @Test
    public void valueOfValidInputWithSettingsTest() {
        Tag tag = Tag.valueOf("tag_name", ParseSettings.preserveCase);
        assertEquals("tag_name", tag.getName());
    }

}