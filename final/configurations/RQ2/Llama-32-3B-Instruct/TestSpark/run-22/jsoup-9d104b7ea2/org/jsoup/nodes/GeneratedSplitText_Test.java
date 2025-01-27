package org.jsoup.nodes;

public class GeneratedSplitText_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void splitText_Test() {
        TextNode newNodes = node.splitText(0);
        assertEquals("Hello, World!", newNodes.text());

        TextNode firstNode = (TextNode) newNodes.clone();
        assertEquals("World", firstNode.nodeName());
        assertEquals("", firstNode.text());
    }

}