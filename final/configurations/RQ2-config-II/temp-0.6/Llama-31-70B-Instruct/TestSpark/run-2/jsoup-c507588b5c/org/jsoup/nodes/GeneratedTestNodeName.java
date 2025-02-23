package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

}