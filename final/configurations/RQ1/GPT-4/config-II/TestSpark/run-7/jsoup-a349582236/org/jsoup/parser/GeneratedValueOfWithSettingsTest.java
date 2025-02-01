package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedValueOfWithSettingsTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        Assert.assertEquals("div", tag.getName());
    }

}