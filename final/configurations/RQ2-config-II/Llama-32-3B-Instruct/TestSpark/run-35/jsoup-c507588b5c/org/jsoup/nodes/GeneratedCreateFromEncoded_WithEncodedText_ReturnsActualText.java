package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateFromEncoded_WithEncodedText_ReturnsActualText {

    @Test
    public void createFromEncoded_WithEncodedText_ReturnsActualText() {
        String encodedText = "test";
        assertEquals("test", TextNode.createFromEncoded(encodedText));
    }

}