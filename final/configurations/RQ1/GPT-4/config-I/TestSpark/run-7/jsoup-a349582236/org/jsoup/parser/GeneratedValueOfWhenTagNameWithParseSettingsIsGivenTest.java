package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWhenTagNameWithParseSettingsIsGivenTest {

    @Test
    public void valueOfWhenTagNameWithParseSettingsIsGivenTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.preserveCase);
        assertEquals("P", tag.getName());
    }

}