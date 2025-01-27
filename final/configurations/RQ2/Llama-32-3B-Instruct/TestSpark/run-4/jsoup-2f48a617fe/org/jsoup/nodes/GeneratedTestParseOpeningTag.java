package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestParseOpeningTag {

    @Test
    public void testParseOpeningTag() {
        // Arrange
        String tag = "<div>";
        HtmlTagParser parser = new HtmlTagParser();

        // Act and Assert
        assertEquals("<div>", parser.parse(tag));
    }

}