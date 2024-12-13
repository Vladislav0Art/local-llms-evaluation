package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfWithSettingsTest {

    private Tag tag;

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings();
        tag = Tag.valueOf("P", settings);
        assertEquals("p", tag.getName());
    }

}