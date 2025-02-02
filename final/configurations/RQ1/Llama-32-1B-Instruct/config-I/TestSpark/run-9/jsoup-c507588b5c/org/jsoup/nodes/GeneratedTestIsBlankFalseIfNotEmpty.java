package org.jsoup.nodes;

public class GeneratedTestIsBlankFalseIfNotEmpty {

    @Test
    public void testIsBlankFalseIfNotEmpty() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

}