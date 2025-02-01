package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedValueOfTagIsNullTest {

    @Test
    public void valueOfTagIsNullTest() {
        try {
            Tag tag = Tag.valueOf(null, ParseSettings.preserveCase);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("tagName must not be null.", e.getMessage());
        }
    }

}