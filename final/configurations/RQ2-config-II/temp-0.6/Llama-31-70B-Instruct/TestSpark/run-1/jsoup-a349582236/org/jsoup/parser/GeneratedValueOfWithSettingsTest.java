package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.mockito.Mockito;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() throws Exception {
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag tag = Tag.valueOf("P", settings);
        assertEquals("p", tag.getName());
    }

}