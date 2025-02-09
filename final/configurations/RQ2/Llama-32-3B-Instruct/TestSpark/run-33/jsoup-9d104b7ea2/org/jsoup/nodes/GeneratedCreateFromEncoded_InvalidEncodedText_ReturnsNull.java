package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_InvalidEncodedText_ReturnsNull {

    @Test
    public void createFromEncoded_InvalidEncodedText_ReturnsNull() {
        String encodedText = "invalid";
        assertNull(TextNode.createFromEncoded(encodedText));
    }

}