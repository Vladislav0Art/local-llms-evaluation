package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Mockito.when(settings.normalizeTag("test")).thenReturn("normalized");
        Tag tag = Tag.valueOf("test", settings);
        assertEquals("normalized", tag.getName());
        Mockito.verify(settings).normalizeTag("test");
    }

}