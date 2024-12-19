package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedParser {

    @Test
    public void parser() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        Parser parser = document.parser(null).parser();

        // Assert
        assertNotNull(parser);
    }

}