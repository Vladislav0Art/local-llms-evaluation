package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestInsertNodeWithToken {

    private Document expectedDocument = new Document();

    @Test
    public void testInsertNodeWithToken() {
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