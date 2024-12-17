package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestFromEncoded {

    @Test
    public void testFromEncoded() {
        String encodedText = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", node.text());
    }

}