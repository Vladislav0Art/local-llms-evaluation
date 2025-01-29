package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestParseSettings {

    @Test
    public void testParseSettings() {
        ParseSettings settings = new ParseSettings();
        expectedValues.put("settingsKey", "value");
        mock(parseSettings(settings));
        Tag value = Tag.valueOf(TAG_NAME, settings);
        when(value.getParseSettings()).thenReturn(settings);
        assertEquals(expectedValues, value.getParseSettings());
    }

}