package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings parseSettings = new ParseSettings(true, false);
        Tag tag = Tag.valueOf("P", parseSettings);
        Assert.assertEquals("P", tag.getName());
    }

}