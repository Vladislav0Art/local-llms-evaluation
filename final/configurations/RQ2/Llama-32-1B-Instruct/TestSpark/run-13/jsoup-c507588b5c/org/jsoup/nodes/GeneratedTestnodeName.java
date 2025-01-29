package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private Appendable mockAppendable;
    private Document mockDocument;

    @Test
    public void testnodeName() {
        String nodeText = "Hello World!";
        TextNode node = new TextNode(nodeText);
        assertEquals("text", node.nodeName());
    }

}