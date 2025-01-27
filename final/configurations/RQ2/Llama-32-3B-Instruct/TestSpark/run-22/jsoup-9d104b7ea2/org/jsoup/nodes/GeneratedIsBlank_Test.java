package org.jsoup.nodes;

public class GeneratedIsBlank_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void isBlank_Test() {
        assertTrue(node.isBlank());
        assertFalse(node.text().isEmpty());
    }

}