package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedTitle setTitle {

    @Test
    public void title

    setTitle() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);
        Document document = new Document(element, null, null);

        // Act
        document.title(null, "New Title");

        // Assert
        assertEquals(baseUri + "/title", document.title());
    }

}