package org.jsoup.nodes;

public class GeneratedTestToStringWithoutNodes {

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
    public void testToStringWithoutNodes() {
        String expectedString = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(expectedString);
        assertEquals(expectedString, node.toString());
    }

}