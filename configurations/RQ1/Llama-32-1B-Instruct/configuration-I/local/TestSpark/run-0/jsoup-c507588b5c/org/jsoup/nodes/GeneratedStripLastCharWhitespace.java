package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

public class GeneratedStripLastCharWhitespace {

    @Test
    public void stripLastCharWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder("   Hello World");
        sb.append('W');

        when(parent.lastCharIsWhitespace(BuilderStringbuilder.newStringBuilder(sb))).thenReturn(true);

        // Act and Assert
        String text = TextNode.lastCharIsWhitespace(sb.toString());
        assertTrue(text.equals("Hello"));
    }

}