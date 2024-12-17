package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCreateFromEncodedTrimming {

    @Test
    public void testCreateFromEncodedTrimming() {
        String encodedText = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", node.text());
    }

}