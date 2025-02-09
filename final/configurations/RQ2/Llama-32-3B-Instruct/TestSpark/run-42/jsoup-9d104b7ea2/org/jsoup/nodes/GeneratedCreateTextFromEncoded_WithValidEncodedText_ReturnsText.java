package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextFromEncoded_WithValidEncodedText_ReturnsText {

    @Test
    public void createTextFromEncoded_WithValidEncodedText_ReturnsText() {
        String encodedText = "Hello, World!";
        TextNode textNode = Document.createTextNode(encodedText);
        assertNotNull(textNode.text());
        assertEquals(encodedText, textNode.text());
    }

}