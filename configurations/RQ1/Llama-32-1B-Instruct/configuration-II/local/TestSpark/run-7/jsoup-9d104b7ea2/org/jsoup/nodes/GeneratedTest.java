package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testBlankNode() {
        TextNode node = new TextNode("   ");
        assertNotNull(node);
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "Hello\nWorld";
        TextNode node = new TextNode(text);
        Node sibling1 = node.splitText(0);
        Node sibling2 = node.splitText(8);

        assertEquals("Hello", sibling1.text());
        assertEquals("World", sibling2.text());
    }

    @Test
    public void testTrimWhitespace() {
        String text = "   Hello World!";
        TextNode node = new TextNode(text);
        assertTrue(node.stripLeadingWhitespace().trim());
    }

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("   ");
        assertEquals(" ", lastCharIsWhitespace(sb));
    }

    @Test
    public void testEntityEscaping() {
        TextNode node = new TextNode("Hello & World!");
        String escapedText = node.toString();
        assertNotNull(escapedText);
        assertTrue(!escapedText.startsWith("&"));
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello, World! ");
        assertEquals("<p>Hello, World!</p>", node.toString());
    }

    @Test
    public void testClone() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = (TextNode) original.clone();
        assertNotNull(cloned);
        assertTrue(original.text().equals(cloned.text()));
    }

}