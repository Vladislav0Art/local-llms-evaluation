package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseForNonEmptyTextNode {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void isBlank_ReturnsFalseForNonEmptyTextNode() {
        assertFalse(node.isBlank());
    }

}