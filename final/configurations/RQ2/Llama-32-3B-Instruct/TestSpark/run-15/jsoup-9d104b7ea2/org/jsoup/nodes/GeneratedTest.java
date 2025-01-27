package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class GeneratedTest {

    private Document documentBuilder = new Document();
    private TextNode node;

    public void setUp() throws Exception {
        node = new TextNode();
        node.setText("Hello World");
    }

    @Override
    public String toString() {
        return "GeneratedTest{}";
    }

    @Test
    public void nodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text() {
        TextNode node = new TextNode("");
        assertNull(node.text());
    }

    @Test
    public void textWithText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void textWithEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void textReplace() {
        TextNode node = new TextNode("Hello World");
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

    @Test
    public void getWholeText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void isBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankNot() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextSingleCharacterOffset() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result1 = (TextNode) node.splitText(0);
        assertEquals("Hello", result1.text());
        assertEquals("\n", result1.getWholeText());

        TextNode result2 = (TextNode) node.splitText(node.text().length() - 1);
        assertEquals("\nWorld", result2.text());
    }

    @Test
    public void splitTextMultipleCharacterOffset() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result0 = (TextNode) node.splitText(4);
        assertEquals("llo", result0.text());

        TextNode result1 = (TextNode) node.splitText(result0.text().length());
        assertEquals("\nWorld", result1.text());
    }

    @Test
    public void createFromEncoded() {
        TextNode node = TextNode.createFromEncoded("%s %s%n");
        assertNotNull(node);
    }

}