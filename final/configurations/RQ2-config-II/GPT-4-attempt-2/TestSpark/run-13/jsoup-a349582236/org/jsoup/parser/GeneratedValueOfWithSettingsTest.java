package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        Assert.assertEquals("div", tag.getName());
    }

}