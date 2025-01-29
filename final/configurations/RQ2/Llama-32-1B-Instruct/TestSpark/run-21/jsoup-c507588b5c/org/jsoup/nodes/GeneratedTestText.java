package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() throws IOException, Exception {
        Node node = new Node("TextNode", "Hello");
        assertEquals("TextNode", TextNode.class.getSuperclass().getName());
        assertEquals("Hello", node.text());
        assertTrue(node.lastCharIsWhitespace(new String[]{"Hello"}));
    }

}