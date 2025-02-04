package org.jsoup.nodes;

public class GeneratedCreateTextNodeGivenRawText_ReturnsTextNode {

    @Test
    public void createTextNodeGivenRawText_ReturnsTextNode() {
        String text = "hello";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.value());
    }

}