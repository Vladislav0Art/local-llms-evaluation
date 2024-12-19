package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedUpdateMetaCharsetElement {

    @Test
    public void updateMetaCharsetElement() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        boolean updated = document.updateMetaCharsetElement();

        // Assert
        assertTrue(updated);
    }

}