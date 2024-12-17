package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateTextNodeFromEncoded_GivenNullEncodedText_ReturnsTextNodeWithEmptyString {

    @Test
    public void createTextNodeFromEncoded_GivenNullEncodedText_ReturnsTextNodeWithEmptyString() throws Exception {
        String encodedText = null;
        Document document = new Document(encodedText);
        TextNode textNode = (TextNode) document.body().children().get(0);
        assertEquals("", textNode.text());
    }

}