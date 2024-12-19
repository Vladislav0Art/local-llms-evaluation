package org.jsoup.nodes;

public class GeneratedTestTextNodeNoWhitespace {

    @Test
    public void testTextNodeNoWhitespace() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

}