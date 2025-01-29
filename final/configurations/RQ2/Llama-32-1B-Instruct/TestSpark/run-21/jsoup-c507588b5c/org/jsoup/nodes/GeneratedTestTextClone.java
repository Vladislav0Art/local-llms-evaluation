package org.jsoup.nodes;

public class GeneratedTestTextClone {

    @Test
    public void testTextClone() throws IOException, Exception {
        Node node = new Node("TextNode", "Hello");
        Node cloned = node.clone();
        assertEquals("TextNode", TextNode.class.getSuperclass().getName());
        assertEquals("Hello", cloned.text());
        assertTrue(node.lastCharIsWhitespace(new String[]{"Hello"}));
    }

}