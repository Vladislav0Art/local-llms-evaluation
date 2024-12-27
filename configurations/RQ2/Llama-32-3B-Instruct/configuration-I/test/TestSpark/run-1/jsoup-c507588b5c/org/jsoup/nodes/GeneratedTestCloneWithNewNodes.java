package org.jsoup.nodes;

public class GeneratedTestCloneWithNewNodes {

    private TextNode textNode;

    @Before
    public void setUp() {
        String text = "Hello, World!";
        textNode = new TextNode(text);
    }

    public void testCreateWithText() {
        assertEquals("Hello, World!", textNode.text());
    }

    public void testnodeName() {
        assertEquals("", textNode.nodeName());
    }

    public void testtext() {
        String newNodeText = "New Hello";
        newNodeText = textNode.text(newNodeText);
        assertNotEquals(textNode.text(), newNodeText);
        assertEquals(newNodeText, newNodeText());
    }

    public void testGetWholeText() {
        String newLine = "\n";
        String wholeText = textNode.getWholeText();
        assertTrue(wholeText.contains("\n"));
    }

    public void testIsBlank() {
        assertNotEquals(true, textNode.isBlank());
    }

    public void testSplitText() {
        TextNode splitNode = textNode.splitText(1);
        assertEquals("World!", splitNode.text());
        assertNotEquals(textNode, splitNode);
    }

    @Test
    public void testCloneWithNewNodes() throws Exception {
        String encodedText = "Hello, World!";
        TextNode originalNode = TextNode.createFromEncoded(encodedText);
        TextNode clonedNode = TextNode.createFromEncoded(encodedText);
        assertFalse(originalNode.equals(clonedNode));
    }

}