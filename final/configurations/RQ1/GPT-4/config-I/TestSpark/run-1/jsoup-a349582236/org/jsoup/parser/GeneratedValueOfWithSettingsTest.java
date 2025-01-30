package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        String name = "TestName";
        Tag tag = Tag.valueOf(name, ParseSettings.preserveCase);
        Assert.assertEquals(name, tag.getName());
    }

}