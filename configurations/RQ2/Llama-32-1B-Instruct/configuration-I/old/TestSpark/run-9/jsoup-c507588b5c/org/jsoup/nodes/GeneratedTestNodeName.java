package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private LeafNode document;
    private String text;

    @Test
    public void testNodeName() {
        document = new TextNode("hello");
        assertEquals("TextNode", document.getNodeName());
    }

}