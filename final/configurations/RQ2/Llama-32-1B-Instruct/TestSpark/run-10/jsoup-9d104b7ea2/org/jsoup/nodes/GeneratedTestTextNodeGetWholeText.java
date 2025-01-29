package org.jsoup.nodes;

public class GeneratedTestTextNodeGetWholeText {

    @Test
    public void testTextNodeGetWholeText() {
        TextNode node = new TextNode("Hello, World!");
        String wholeText = node.getWholeText();
        assertEquals("Hello, World!", wholeText);
    }

}