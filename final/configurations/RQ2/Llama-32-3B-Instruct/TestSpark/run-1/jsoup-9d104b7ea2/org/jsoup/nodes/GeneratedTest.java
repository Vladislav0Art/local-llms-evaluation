package org.jsoup.nodes;

public class GeneratedTest {

    private String text;
    private NodeTypes type;

    public enum NodeTypes {TEXT}

    ;

    public static TextNode createFromEncoded(String encodedText) {
        // implementation
        return new TextNode();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Document document() {
        Document doc = new Document();
        // implementation
        return doc;
    }
}

public class TextNodeTest {

    @Test
    public void newNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.text());
    }

    @Test
    public void nodeName() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void textSet() {
        String newText = "New Hello World";
        TextNode node = new TextNode("");
        node.text(newText);
        assertEquals(newText, node.text());
    }

    @Test
    public void getWholeText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlank() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("   ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("Hello World");
        assertFalse(node3.isBlank());
    }

    @Test
    public void splitText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode node1 = (TextNode) node.splitText(0);
        assertEquals(text.substring(0, 5), node1.text());

        TextNode node2 = (TextNode) node.splitText(5);
        assertEquals("World", node2.text());
    }

}