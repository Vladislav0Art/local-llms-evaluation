package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedValueOfCaseInsensitiveTest {

    @Test
    public void valueOfCaseInsensitiveTest() {
        ParseSettings parseSettings = ParseSettings.htmlDefault;
        Tag tag = Tag.valueOf("P", parseSettings);
        assertTrue(tag.isKnownTag());
    }

}