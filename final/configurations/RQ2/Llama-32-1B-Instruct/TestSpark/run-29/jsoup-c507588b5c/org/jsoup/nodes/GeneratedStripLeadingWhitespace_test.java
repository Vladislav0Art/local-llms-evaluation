package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedStripLeadingWhitespace_test {

    @Test
    public void stripLeadingWhitespace_test() {
        String text = "   Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(8, node.stripLeadingWhitespace().length());
        // assertEqual(3, node.stripLeadingWhitespace(""));
    }

}