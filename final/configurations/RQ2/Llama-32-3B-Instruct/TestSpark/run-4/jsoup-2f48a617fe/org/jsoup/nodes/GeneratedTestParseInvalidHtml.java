package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestParseInvalidHtml {

    @Test
    public void testParseInvalidHtml() {
        // Arrange
        String html = "<html><body>Hello >World!</body></html>";
        HtmlParser parser = new HtmlParser();

        // Act and Assert
        assertThrows(HtmlParseException.class, () -> parser.parse(html));
    }
}

class HtmlParser {
    public String parse(String html) throws HtmlParseException {
        // Implementation of parsing logic
        return html;
    }
}

class HtmlParseException extends RuntimeException {
}

}