package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectValue {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void nodeName_ReturnsCorrectValue() {
        assertEquals("text", node.nodeName());
    }

}