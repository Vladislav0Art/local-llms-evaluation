package org.jsoup.nodes;

public class GeneratedTestTextNodeLeadingWhitespace {

    @Test
    public void testTextNodeLeadingWhitespace() {
        TextNode node = new TextNode("   Hello World");
        assertFalse(node.isBlank());
    }

}