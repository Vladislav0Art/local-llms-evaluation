package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings(true, false);
        Tag tag = Tag.valueOf("div", settings);
        Assert.assertEquals("div", tag.getName());
    }

}