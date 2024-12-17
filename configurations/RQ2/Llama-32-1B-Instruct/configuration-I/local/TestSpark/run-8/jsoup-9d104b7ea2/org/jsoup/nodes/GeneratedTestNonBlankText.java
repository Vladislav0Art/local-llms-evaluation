package org.jsoup.nodes;

public class GeneratedTestNonBlankText {

    @Test
    public void testNonBlankText() {
        TextNode textNode = new TextNode("Hello World");
        assertTrue(!textNode.isBlank());
    }

}