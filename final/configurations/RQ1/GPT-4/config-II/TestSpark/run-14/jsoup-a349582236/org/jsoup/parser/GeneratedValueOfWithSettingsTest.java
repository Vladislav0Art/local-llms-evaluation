package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.toLowerCase);
        String expectedNormalName = "div";
        String actualNormalName = tag.normalName();
        Assert.assertEquals(expectedNormalName, actualNormalName);
    }

}