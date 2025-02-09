package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithSettingExistingTagTest {

    @Test
    public void valueOfWithSettingExistingTagTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertNotNull(tag);
    }

}