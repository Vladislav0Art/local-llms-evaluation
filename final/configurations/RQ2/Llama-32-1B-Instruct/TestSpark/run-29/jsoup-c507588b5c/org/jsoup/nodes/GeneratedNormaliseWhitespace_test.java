package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedNormaliseWhitespace_test {

    @Test
    public void normaliseWhitespace_test() {
        String text = "   Hello, World!  ";
        TextNode node = new TextNode(text);
        assertEquals(5, node.stripLeadingWhitespace().length());
        // assertEqual(4, node.stripLeadingWhitespace("Hello, World!"));
    }

}