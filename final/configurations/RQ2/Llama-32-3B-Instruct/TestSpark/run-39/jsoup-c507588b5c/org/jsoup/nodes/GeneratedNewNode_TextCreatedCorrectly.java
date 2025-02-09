package org.jsoup.nodes;

public class GeneratedNewNode_TextCreatedCorrectly {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void newNode_TextCreatedCorrectly() {
        assertEquals("Hello, World!", node.text());
    }

}