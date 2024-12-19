package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedConnection {

    @Test
    public void connection() {
        // Arrange
        String baseUri = "https://example.com";
        Connection connection = null;

        // Act
        Document document = new Document(new Element("html"), connection);
        String cssQuery = "/form";
        FormElement form = document.expectForm(cssQuery);

        // Assert
        assertNotNull(form);
    }

}