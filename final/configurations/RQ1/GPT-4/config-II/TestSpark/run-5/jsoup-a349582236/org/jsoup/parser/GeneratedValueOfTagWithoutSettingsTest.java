package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfTagWithoutSettingsTest {

    @Test
    public void valueOfTagWithoutSettingsTest() {
        Tag tag = Tag.valueOf("testTag");
        Assert.assertEquals("testtag", tag.normalName());
    }

}