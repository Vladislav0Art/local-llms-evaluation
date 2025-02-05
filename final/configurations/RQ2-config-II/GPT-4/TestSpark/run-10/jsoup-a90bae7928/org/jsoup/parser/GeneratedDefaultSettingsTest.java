package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        // Scenario: Verify the default settings
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings parseSettings = xmlTreeBuilder.defaultSettings();
        Assert.assertNotNull(parseSettings);
    }

}