package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void normaliseWhitespace_Test() {
        assertEquals("Hello, World!", TextNode.normaliseWhitespace("   Hello, World!   "));
        assertEquals("", TextNode.normaliseWhitespace("   "));
        assertEquals("", TextNode.stripLeadingWhitespace("\n"));
    }

}