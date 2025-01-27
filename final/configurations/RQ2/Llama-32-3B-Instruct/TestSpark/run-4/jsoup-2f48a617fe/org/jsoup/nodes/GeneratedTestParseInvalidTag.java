package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestParseInvalidTag {

    @Test
    public void testParseInvalidTag() {
        // Arrange
        String tag = "< invalid-tag>";
        HtmlTagParser parser = new HtmlTagParser();

        // Act and Assert
        assertThrows(HtmlParseException.class, () -> parser.parse(tag));
    }
}

class HtmlTagParser {
    public String parse(String tag) throws HtmlParseException {
        // Implementation of parsing logic
        return tag;
    }

}