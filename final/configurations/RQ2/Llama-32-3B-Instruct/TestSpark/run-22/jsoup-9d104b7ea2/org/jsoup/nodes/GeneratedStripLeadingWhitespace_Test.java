package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void stripLeadingWhitespace_Test() {
        assertEquals("Hello, World!", TextNode.stripLeadingWhitespace("   Hello, World!   "));
        assertEquals("", TextNode.stripLeadingWhitespace("\n"));
    }

}