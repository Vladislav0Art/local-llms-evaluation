package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateTextNodeFromEncoded_GivenEncodedText_ReturnsTextNodeWithUnencodedText {

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNodeWithUnencodedText() throws Exception {
        String encodedText = "Hello World";
        Document document = new Document(encodedText);
        TextNode textNode = (TextNode) document.body().children().get(0);
        assertEquals(encodedText, textNode.text());
    }

}