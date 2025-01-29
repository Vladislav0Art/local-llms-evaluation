package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestNameNode {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testNameNode() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        String nodeName = document.nodeName();

        // Assert
        assertEquals("test", nodeName);
    }
}

class DocumentParser {

    private final Parser parser;

    public DocumentParser(String baseUri) {
        this.parser = new DocumentParser(baseUri);
    }

    public Element parse(String html) {
        return parser.parse(html);
    }

    @Override
    public String toString() {
        return "<parser>";
    }
}

class ParserTest {

    private final DocumentParser parser;

    public ParserTest(DocumentParser parser) {
        this.parser = parser;
    }

}