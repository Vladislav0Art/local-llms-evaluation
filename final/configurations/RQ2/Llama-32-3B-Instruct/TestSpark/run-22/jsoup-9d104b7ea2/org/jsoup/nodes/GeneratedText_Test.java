package org.jsoup.nodes;

public class GeneratedText_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void text_Test() {
        assertEquals("Hello, World!", node.text());
        assertEquals("Hello, World!", node.text(node.text()));
    }

}