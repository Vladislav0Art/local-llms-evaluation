package org.jsoup.nodes;

public class GeneratedTestTextNodeToString {

    @Test
    public void testTextNodeToString() {
        TextNode node = new TextNode("Hello");
        String string = node.toString();
        assertEquals("\"Hello\"", string);
    }

}