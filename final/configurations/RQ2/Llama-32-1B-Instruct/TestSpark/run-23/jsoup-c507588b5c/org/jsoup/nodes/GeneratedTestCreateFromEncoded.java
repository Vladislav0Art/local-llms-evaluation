package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        // Create an encoded string representing a text node
        String encodedText = "<text>Hello, World!</text>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

}