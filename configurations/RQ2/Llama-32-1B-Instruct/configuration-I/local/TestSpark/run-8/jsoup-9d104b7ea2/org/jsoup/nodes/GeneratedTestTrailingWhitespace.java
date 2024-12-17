package org.jsoup.nodes;

public class GeneratedTestTrailingWhitespace {

    @Test
    public void testTrailingWhitespace() {
        TextNode textNode = new TextNode("Hello   World");
        assertTrue(!textNode.isBlank());
    }

}