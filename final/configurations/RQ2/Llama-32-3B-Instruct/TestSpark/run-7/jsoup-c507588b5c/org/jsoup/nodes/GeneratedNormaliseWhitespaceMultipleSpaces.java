package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedNormaliseWhitespaceMultipleSpaces {

    @Test
    public void normaliseWhitespaceMultipleSpaces() {
        // Arrange
        String text = "   abc  ";

        // Act & Assert
        assertEquals("abc", StringUtil.normaliseWhitespace(text));
    }

}