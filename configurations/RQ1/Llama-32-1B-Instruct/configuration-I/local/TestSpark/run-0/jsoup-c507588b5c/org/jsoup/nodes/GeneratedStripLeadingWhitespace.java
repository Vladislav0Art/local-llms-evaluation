package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

public class GeneratedStripLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello World");

        when(parent.stripLeadingWhitespace(BuilderStringBuilder.newStringBuilder(sb))).thenReturn(false);

        // Act and Assert
        String text = TextNode.stripLeadingWhitespace(sb.toString());
        assertTrue(text.isEmpty());
    }

}