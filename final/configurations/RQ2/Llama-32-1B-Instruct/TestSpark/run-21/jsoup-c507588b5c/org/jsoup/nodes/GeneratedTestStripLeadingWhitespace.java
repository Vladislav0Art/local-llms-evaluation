package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() throws IOException, Exception {
        Node node = new Node("TextNode", "   Hello  ");
        assertEquals("Hello", node.text());
        assertTrue(node.lastCharIsWhitespace(new String[]{"World"}));
    }

}