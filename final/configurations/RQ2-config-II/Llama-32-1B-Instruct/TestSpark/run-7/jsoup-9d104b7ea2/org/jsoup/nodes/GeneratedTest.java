package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getText());
    }

    @Test
    public void testGetWholeTextBlank() {
        TextNode node = new TextNode("");
        assertEquals("", node.getText());
    }

    @Test
    public void testGetWholeTextNonBlank() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.getText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testIsBlankNonEmpty() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getText());
    }

    @Test
    public void testTextBlank() {
        TextNode node = new TextNode("");
        assertEquals("", node.getText());
    }

    @Test
    public void testTextNonEmpty() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.getText());
    }

    @Test
    public void testGetWholeTextNonBlank() {
        TextNode node = new TextNode("Hello World\nThis is a test");
        assertEquals("Hello World This is a test", node.getText());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World\nThis is a test");
        String[] split = node.splitText(0);
        assertEquals("Hello ", split[0]);
        assertEquals("World \nThis is a test", split[1]);
    }

    @Test
    public void testSplitTextBlank() {
        TextNode node = new TextNode("");
        String[] split = node.splitText(0);
        assertEquals("", split[0]);
        assertEquals("", split[1]);
    }

    @Test
    public void testGetWholeTextLastCharWhitespace() {
        TextNode node = new TextNode("Hello World");
        StringBuilder sb = new StringBuilder();
        node.replaceWith(sb, 0, " ");
        assertEquals("Hello ", sb.toString());
    }

}