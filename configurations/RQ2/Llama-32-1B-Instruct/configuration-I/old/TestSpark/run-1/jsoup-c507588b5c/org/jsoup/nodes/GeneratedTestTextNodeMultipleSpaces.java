package org.jsoup.nodes;

public class GeneratedTestTextNodeMultipleSpaces {

    @Test
    public void testTextNodeMultipleSpaces() {
        TextNode node = new TextNode("Hello World  and This is a Test.");
        assertFalse(node.isBlank());
    }

}