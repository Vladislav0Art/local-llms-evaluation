package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestParseWithBaseUri {

    @Test
    public void testParseWithBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertEquals("http://example.com", settings.getBaseUri());
    }

}