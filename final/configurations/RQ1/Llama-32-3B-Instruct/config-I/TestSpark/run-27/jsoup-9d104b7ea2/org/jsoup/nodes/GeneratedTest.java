package org.jsoup.nodes;

public class GeneratedTest {

    private TextNode textNode;

    @Test
    public void [TextNodeCreation][WithValidText]

    Test() {
        String text = "Hello, World!";
        textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void [TextNodeCreation][WithBlankText]

    Test() {
        String text = "";
        textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
        assertEquals("", textNode.text());
    }

    @Test
    public void [TextNodeSplitting][AtOffset0]

    Test() {
        String originalText = "Hello, World!";
        int offset = 0;
        textNode = new TextNode(originalText);
        textNode = (TextNode) textNode.splitText(offset);
        assertEquals(originalText.substring(0, offset), ((TextNode) textNode).text());
    }

    @Test
    public void [TextNodeSplitting][AtOffset1]

    Test() {
        String originalText = "Hello, World!";
        int offset = 1;
        textNode = new TextNode(originalText);
        textNode = (TextNode) textNode.splitText(offset);
        assertEquals(originalText.substring(0, offset), ((TextNode) textNode).text());
    }

    @Test
    public void [TextNodeSplitting][InvalidOffset]

    Test() {
        String originalText = "Hello, World!";
        int offset = 10;
        textNode = new TextNode(originalText);
        assertThrows(IndexOutOfBoundsException.class, () -> textNode.splitText(offset));
    }

    @Test
    public void [TextNodeNormalisation]

    Test() {
        String text = "   ";
        textNode = new TextNode(text);
        assertEquals("   ", textNode.text());
    }

    @Test
    public void [TextNodeTrimming]

    Test() {
        String originalText = "\n  \t";
        String trimmedText = "  ";
        textNode = new TextNode(originalText);
        textNode = (TextNode) textNode.trim();
        assertEquals(trimmedText, ((TextNode) textNode).text());
    }

    @Test
    public void [TextNodeIsBlank]

    Test() {
        String originalText = "\n  \t";
        boolean isBlank = textNode.text().isEmpty();
        assertTrue(isBlank);
    }

    @Test
    public void [TextNodeToString]

    Test() {
        String originalText = "Hello, World!";
        textNode = new TextNode(originalText);
        assertEquals("Hello, World!", ((TextNode) textNode).toString());
    }

}