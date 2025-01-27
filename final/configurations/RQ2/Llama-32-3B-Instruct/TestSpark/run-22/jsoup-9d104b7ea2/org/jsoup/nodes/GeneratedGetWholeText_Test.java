package org.jsoup.nodes;

public class GeneratedGetWholeText_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void getWholeText_Test() {
        assertEquals("Hello, World!", node.getWholeText());
    }

}