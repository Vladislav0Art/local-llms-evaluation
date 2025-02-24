package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfTagWithParseSettingsTest {

    Tag tag = new Tag();

    @Test
    public void valueOfTagWithParseSettingsTest() {
        Tag expected = new Tag();
        ParseSettings settings = new ParseSettings();
        Tag actual = Tag.valueOf("div", settings);
        assertEquals(expected, actual);
    }

}