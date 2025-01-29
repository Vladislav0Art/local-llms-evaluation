package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestInsertEndTag {

    private Document expectedDocument = new Document();

    @Test
    public void testInsertEndTag() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

}