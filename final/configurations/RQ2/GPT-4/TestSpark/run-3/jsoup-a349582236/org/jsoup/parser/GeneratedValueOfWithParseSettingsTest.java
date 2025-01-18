package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithParseSettingsTest {

    @Test
    public void valueOfWithParseSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        Assert.assertNotNull(tag);
        Assert.assertEquals("div", tag.getName());
    }

}