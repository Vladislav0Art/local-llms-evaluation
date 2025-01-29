package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() throws IOException, Exception {
        Node node = new Node("TextNode", "Hello");
        assertEquals("TextNode", TextNode.class.getSuperclass().getName());
        assertEquals("Hello", node.nodeName());
        assertEquals("Hello World", node.text());
        assertTrue(node.lastCharIsWhitespace(new String[]{"Hello", "World"}));
    }

}