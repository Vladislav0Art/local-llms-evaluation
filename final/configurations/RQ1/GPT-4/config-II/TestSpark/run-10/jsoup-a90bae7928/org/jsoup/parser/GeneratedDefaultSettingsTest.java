package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.defaultSettings());
    }

}