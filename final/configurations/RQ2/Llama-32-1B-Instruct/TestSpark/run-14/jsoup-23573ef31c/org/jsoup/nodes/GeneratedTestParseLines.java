package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseLines {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testParseLines() {
        // Arrange
        String html = "\ntest\n";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

}