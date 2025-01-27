package org.jsoup.nodes;

public class GeneratedToString_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void toString_Test() {
        assertEquals("textHello, World!", node.toString());
    }

}