package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testnodeName() {
        assertEquals("text", node.getNodeName());
    }

}