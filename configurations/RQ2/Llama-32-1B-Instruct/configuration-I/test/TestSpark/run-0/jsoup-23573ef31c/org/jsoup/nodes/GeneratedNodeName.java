package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        Document document = new Document(element, null, null);
        String nodeName = document.nodeName();

        // Assert
        assertEquals("html", nodeName);
    }

}