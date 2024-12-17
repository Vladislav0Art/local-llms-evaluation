package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testTextNodeBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testTextNodeNoWhitespace() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void testTextNodeSingleSpace() {
        TextNode node = new TextNode("   Hello ");
        assertTrue(node.isBlank());
    }

    @Test
    public void testTextNodeMultipleSpaces() {
        TextNode node = new TextNode("Hello World  and This is a Test.");
        assertFalse(node.isBlank());
    }

    @Test
    public void testTextNodeWhitespaceAfterSplit() {
        TextNode node1 = new TextNode("");
        TextNode node2 = new TextNode("Hello ");
        assertTrue(node1.splitText(5).isBlank()); // Assuming the split offset is 5
    }

    @Test
    public void testTextNodeLeadingWhitespace() {
        TextNode node = new TextNode("   Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void testTextNodeLastCharIsWhitespace() {
        StringBuilder builder = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(builder));
    }

    @Test
    public void testTextNodeNormaliseWhitespace() {
        String text = "   Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.text());
    }

    @Test
    public void testTextNodeStripLeadingWhitespace() {
        StringBuilder builder = new StringBuilder();
        assertTrue(TextNode.stripLeadingWhitespace(builder.toString()).equals("Hello World"));
    }

}