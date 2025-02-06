package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_GivenEncodedText_ReturnsCorrectTextNode {

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsCorrectTextNode() {
        String encodedText = "{text}";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
    }

}