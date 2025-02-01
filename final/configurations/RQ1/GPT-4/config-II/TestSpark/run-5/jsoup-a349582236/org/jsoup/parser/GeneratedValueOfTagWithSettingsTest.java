package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfTagWithSettingsTest {

    @Test
    public void valueOfTagWithSettingsTest() {
        Tag tag = Tag.valueOf("Tag", ParseSettings.preserveCase);
        Assert.assertEquals("Tag", tag.getName());
    }

}