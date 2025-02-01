package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.lowerCase);
        assertEquals("p", tag.getName());
    }

}