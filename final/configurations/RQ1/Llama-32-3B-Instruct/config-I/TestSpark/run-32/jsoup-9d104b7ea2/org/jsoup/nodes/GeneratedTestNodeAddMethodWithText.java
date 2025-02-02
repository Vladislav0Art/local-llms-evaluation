package org.jsoup.nodes;

public class GeneratedTestNodeAddMethodWithText {

    @Test
    public void testNodeAddMethodWithText() throws Exception {
        Node parentNode = new Node();
        TextNode textNode = new TextNode("");
        assertEquals(1, (int) parentNode.addNode(0, textNode));
    }

}