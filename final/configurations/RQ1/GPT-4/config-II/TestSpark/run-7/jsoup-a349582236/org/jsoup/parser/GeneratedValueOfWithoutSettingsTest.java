package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedValueOfWithoutSettingsTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertEquals("p", tag.getName());
    }

}