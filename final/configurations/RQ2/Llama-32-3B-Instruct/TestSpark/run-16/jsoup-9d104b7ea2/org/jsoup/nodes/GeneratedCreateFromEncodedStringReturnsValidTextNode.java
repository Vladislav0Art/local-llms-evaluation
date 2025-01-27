package org.jsoup.nodes;

public class GeneratedCreateFromEncodedStringReturnsValidTextNode {

    @Test
    public void createFromEncodedStringReturnsValidTextNode() throws IOException {
        String encodedText = "Hello";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
    }

}