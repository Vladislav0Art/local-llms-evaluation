package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseString {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testParseString() {
        // Arrange
        String html = "test";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

}