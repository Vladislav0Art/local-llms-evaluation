package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInitialiseParse_withBaseUri {

    @Test
    public void testInitialiseParse_withBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertEquals("http://example.com", settings.getBaseUri());
    }

}