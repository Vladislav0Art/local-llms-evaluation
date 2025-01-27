package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespaceSingleSpace {

    @Test
    public void stripLeadingWhitespaceSingleSpace() {
        // Arrange
        String text = " abc";

        // Act & Assert
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }

}