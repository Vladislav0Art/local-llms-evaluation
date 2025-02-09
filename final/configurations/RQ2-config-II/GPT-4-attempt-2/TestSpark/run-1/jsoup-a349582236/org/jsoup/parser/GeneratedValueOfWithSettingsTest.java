package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Tag sampleTag = Tag.valueOf("div", ParseSettings.htmlDefault);
        Assert.assertNotNull(sampleTag);
    }

}