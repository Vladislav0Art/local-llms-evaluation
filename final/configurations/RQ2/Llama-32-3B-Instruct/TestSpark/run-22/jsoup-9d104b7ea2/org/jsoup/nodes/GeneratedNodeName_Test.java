package org.jsoup.nodes;

public class GeneratedNodeName_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void nodeName_Test() {
        assertEquals("text", node.nodeName());
    }

}