package org.jsoup.nodes;

public class GeneratedTestGetWholeTextLastCharWhitespace {

    @Test
    public void testGetWholeTextLastCharWhitespace() {
        TextNode node = new TextNode("Hello World");
        StringBuilder sb = new StringBuilder();
        node.replaceWith(sb, 0, " ");
        assertEquals("Hello ", sb.toString());
    }

}