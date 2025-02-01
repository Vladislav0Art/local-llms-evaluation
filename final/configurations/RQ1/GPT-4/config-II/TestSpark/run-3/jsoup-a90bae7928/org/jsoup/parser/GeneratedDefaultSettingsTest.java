package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings defaultSettings = xmlTreeBuilder.defaultSettings();
        assertSame(ParseSettings.preserveCase, defaultSettings);
    }

}