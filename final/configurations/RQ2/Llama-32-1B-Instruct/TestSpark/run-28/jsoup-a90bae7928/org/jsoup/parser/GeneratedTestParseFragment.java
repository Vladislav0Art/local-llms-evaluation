package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestParseFragment {

    private Document expectedDocument = new Document();

    @Test
    public void testParseFragment() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();
        DocumentFragment fragment = builder.parseFragment(new java.io.StringReader(""));
        expectedDocument.appendChild(fragment);

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

}