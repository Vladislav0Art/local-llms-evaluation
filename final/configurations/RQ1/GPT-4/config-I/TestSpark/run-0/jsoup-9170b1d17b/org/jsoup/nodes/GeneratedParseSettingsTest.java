package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseSettingsTest {

    @Test
    public void parseSettingsTest() {
        ParseSettings settings = ParseSettings.preserveCase;
        assertTrue(settings.preserveAttributeCase());
    }

}