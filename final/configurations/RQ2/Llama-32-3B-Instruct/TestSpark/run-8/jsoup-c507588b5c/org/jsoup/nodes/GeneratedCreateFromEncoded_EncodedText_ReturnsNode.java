package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_EncodedText_ReturnsNode {

    @Test
    public void createFromEncoded_EncodedText_ReturnsNode() {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}