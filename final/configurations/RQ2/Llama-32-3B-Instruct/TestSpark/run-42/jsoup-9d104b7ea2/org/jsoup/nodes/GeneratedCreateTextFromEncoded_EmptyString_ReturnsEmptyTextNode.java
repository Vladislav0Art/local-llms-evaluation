package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextFromEncoded_EmptyString_ReturnsEmptyTextNode {

    @Test
    public void createTextFromEncoded_EmptyString_ReturnsEmptyTextNode() {
        String emptyEncodedText = "";
        TextNode textNode = Document.createTextNode(emptyEncodedText);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

}