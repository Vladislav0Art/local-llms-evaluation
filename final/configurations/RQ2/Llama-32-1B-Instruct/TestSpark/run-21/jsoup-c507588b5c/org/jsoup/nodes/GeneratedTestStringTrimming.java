package org.jsoup.nodes;

public class GeneratedTestStringTrimming {

    @Test
    public void testStringTrimming() throws IOException, Exception {
        Node node = new Node("TextNode", "Hello World");
        assertEquals("Hello World", node.text());
        assertTrue(node.lastCharIsWhitespace(new String[]{"World"}));
    }

}