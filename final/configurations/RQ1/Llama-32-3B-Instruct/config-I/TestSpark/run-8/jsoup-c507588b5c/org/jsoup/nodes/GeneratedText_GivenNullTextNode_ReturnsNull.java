package org.jsoup.nodes;

public class GeneratedText_GivenNullTextNode_ReturnsNull {

    @Test
    public void text_GivenNullTextNode_ReturnsNull() {
        assertNull(TextNode.createFromEncoded(null).text());
    }

}