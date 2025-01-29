package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestInitializeParse {

    private Document expectedDocument = new Document();

    @Test
    public void testInitializeParse() {
        // Arrange
        String baseUri = "";
        Parser parser = null;
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new java.io.StringReader(baseUri), defaultSettings, parser);

        // Assert
        assertEquals(expectedDocument, builder.parse(new java.io.StringReader(baseUri)).getDoc());
    }

}