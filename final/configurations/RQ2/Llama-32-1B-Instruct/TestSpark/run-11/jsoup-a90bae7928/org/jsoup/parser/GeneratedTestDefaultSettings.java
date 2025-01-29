package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestDefaultSettings {

    @Test
    public void testDefaultSettings() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertEquals("application/xml", settings.getNamespace());
    }

}