package org.jsoup.nodes;

public class GeneratedIsBlankReturnsFalseIfNotEmpty {

    @Test
    public void isBlankReturnsFalseIfNotEmpty() {
        TextNode node = new TextNode("Hello, World!");
        assertFalse(node.isBlank());
    }

}