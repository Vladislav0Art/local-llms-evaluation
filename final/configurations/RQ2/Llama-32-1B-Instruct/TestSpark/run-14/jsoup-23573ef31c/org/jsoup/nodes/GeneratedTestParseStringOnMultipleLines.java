package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseStringOnMultipleLines {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testParseStringOnMultipleLines() {
        // Arrange
        String html = "\n\ntest";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

}