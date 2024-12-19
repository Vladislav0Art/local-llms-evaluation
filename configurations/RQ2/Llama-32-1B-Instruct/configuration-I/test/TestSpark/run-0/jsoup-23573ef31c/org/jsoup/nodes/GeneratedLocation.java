package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedLocation {

    @Test
    public void location() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        Document document = new Document(element, null, null);
        String location = document.location().toString();

        // Assert
        assertEquals(baseUri + "/", location);
    }

}