package org.jsoup.nodes;

public class GeneratedCreateFromEncodedReturnsCorrectNode {

    @Test
    public void createFromEncodedReturnsCorrectNode() {
        // Given: encoded text
        String encodedText = "<p>Hello</p>";
        TextNode node = TextNode.createFromEncoded(encodedText);

        // When: nodeName()
        String nodeName = node.nodeName();

        // Then: nodeName() returns expected value
        assertEquals(nodeName, "TEXT");
    }

}