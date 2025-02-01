package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedValueOfWithoutSettingsTest {

    @Test
    public void valueOfWithoutSettingsTest() {
        Validate.notNull("span");
        Tag tag = Tag.valueOf("SPAN");
        // testing the settings do not preserve case
        Assert.assertEquals(tag.normalName(), tag.getName());
    }

}