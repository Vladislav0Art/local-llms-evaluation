package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHeadTail {

    @Test
    public void testOuterHtmlHeadTail() {
        // Arrange
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        myElement.outerHtmlHead(accum, 1, out);

        // Act
        String tail = myElement.outerHtmlTail(accum, 2, out);

        // Assert
        assertEquals("My Element", tail);
    }

}