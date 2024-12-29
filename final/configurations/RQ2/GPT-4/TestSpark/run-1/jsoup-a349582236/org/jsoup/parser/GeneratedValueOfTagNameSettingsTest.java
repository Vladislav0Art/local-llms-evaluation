package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedValueOfTagNameSettingsTest {

    @Test
    public void valueOfTagNameSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        Assert.assertTrue(tag instanceof Tag);
    }

}