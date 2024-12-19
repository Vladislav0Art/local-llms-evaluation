package org.jsoup.nodes;

public class GeneratedTestTextNodeNormaliseWhitespace {

    @Test
    public void testTextNodeNormaliseWhitespace() {
        String text = "   Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.text());
    }

}