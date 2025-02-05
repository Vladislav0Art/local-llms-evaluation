package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedValueOfTagNameAndSettingsTest {

    @Test
    public void valueOfTagNameAndSettingsTest() {
        Tag tag = Tag.valueOf("span", ParseSettings.preserveCase);
        Assert.assertEquals("span", tag.getName());
    }

}