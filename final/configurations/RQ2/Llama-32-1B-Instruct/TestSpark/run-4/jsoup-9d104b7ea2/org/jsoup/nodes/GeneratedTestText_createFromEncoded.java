package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestText_createFromEncoded {

    @Test
    public void testText_createFromEncoded() {
        String encodedText = "Hello World";
        TextNode createdNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, createdNode.text());
    }

}