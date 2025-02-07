package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private TextNode node;
    private Document document;

    @Test
    public void testnodeName() {
        String expected = "Text";
        node = new TextNode("Hello, World!");
        assertEquals(expected, node.nodeName());
    }

}