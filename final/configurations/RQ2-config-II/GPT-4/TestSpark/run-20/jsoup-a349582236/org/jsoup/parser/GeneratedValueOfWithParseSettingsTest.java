package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithParseSettingsTest {

    @Test
    public void valueOfWithParseSettingsTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("test", settings);
        Assert.assertEquals("TEST", tag.getName());
    }

}