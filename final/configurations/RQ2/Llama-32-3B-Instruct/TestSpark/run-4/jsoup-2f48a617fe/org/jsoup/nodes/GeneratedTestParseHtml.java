package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestParseHtml {

    @Test
    public void testParseHtml() {
        // Arrange
        String html = "<html><body>Hello World!</body></html>";
        HtmlParser parser = new HtmlParser();

        // Act
        String parsedHtml = parser.parse(html);

        // Assert
        assertEquals("<html><body>Hello World!</body></html>", parsedHtml);
    }

}