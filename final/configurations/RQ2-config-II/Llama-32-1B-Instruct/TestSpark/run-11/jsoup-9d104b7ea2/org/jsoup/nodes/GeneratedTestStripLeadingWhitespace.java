package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        Element element = new Document().createElement("text", "   Hello World  ");
        TextNode node = Mockito.mock(TextNode.class);
        when(node.stripLeadingWhitespace(Mockito.any(StringBuilder.class))).thenReturn(""); // Test that stripLeadingWhitespace() returns the expected value
        assertEquals("", element.stripLeadingWhitespace(""));
        Mockito.verify(node).stripLeadingWhitespace();
    }

}