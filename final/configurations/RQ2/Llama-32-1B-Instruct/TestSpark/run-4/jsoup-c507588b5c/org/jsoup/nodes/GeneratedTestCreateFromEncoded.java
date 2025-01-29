package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() throws IOException {
        String encodedText = "test";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("test", node.text());
    }

}