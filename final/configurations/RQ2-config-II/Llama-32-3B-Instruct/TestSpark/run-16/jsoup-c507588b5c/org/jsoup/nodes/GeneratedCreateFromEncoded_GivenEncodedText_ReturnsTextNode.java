package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_GivenEncodedText_ReturnsTextNode {

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "Hello%20World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
        assertEquals("Hello World", textNode.text());
    }

}