package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class GeneratedValueOfWithSettingsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings("html", "html");
        Tag tag = Tag.valueOf("div", settings);
        Assert.assertEquals("div", tag.getName());
    }

}