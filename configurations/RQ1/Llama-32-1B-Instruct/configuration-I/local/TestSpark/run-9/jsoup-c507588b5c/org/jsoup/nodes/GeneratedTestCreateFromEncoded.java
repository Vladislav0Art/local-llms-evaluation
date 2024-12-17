package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        Document doc = new Document();
        String encodedText = "test";
        TextNode node = TestTextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.getText());
    }

}