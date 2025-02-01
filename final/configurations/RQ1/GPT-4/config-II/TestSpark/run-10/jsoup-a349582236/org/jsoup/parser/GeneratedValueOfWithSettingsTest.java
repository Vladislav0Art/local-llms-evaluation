package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Validate.notNull("span");
        Tag tag = Tag.valueOf("span", ParseSettings.preserveCase);
        // testing the settings preserve case
        Assert.assertNotEquals(tag.normalName(), tag.getName());
    }

}