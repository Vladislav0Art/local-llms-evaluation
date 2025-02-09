package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings ps = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("div", ps);
        Assert.assertEquals("div", tag.getName());
    }

}