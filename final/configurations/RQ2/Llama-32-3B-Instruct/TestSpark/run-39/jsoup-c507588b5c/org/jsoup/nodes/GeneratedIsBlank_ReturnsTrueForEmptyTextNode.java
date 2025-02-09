package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueForEmptyTextNode {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void isBlank_ReturnsTrueForEmptyTextNode() {
        assertTrue(node.isBlank());
    }

}