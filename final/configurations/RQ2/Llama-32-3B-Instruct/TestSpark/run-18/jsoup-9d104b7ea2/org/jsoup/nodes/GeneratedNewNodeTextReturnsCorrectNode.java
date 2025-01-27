package org.jsoup.nodes;

public class GeneratedNewNodeTextReturnsCorrectNode {

    @Test
    public void newNodeTextReturnsCorrectNode() {
        // Given: new TextNode("Hello World")
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // When: nodeName()
        String nodeName = node.nodeName();

        // Then: nodeName() returns expected value
        assertEquals(nodeName, "TEXT");
    }

}