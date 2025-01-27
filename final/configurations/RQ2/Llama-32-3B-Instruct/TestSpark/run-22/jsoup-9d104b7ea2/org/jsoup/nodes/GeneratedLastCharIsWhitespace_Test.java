package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void lastCharIsWhitespace_Test() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("Hello")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuffer()));
    }

}