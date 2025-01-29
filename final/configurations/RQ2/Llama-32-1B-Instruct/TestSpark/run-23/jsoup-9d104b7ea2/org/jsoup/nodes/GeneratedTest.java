package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testTextNodeCreateFromEncoded() {
        String encodedText = "Hello World";
        TestTextNodeCreateFromEncoded createFromEncoded = new TestTextNodeCreateFromEncoded(encodedText);
        TestTextNode textNode = createFromEncoded.create();
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void testTextNodeText() {
        String text = "Hello World";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        assertEquals("Hello World", node.toString().trim());
    }

    @Test
    public void testTextNodeTextNoBlank() {
        String text = "Hello World\n";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        assertTrue(node.isBlank());
    }

    @Test
    public void testTextNodeSplitText() {
        String text = "Hello World\n";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        String[] splitText = node.splitText(0);
        assertEquals("Hello", splitText[0].trim());
        assertTrue(splitText.length == 1);

        text = "Hello World\n\n";
        TestTextNodeNode node2 = new TextNodeNode(text, "Hello World");
        String[] splitText2 = node2.splitText(0);
        assertEquals("Hello", splitText2[0].trim());
        assertTrue(splitText2.length == 1);

        text = "Hello World\na";
        TestTextNodeNode node3 = new TextNodeNode(text, "Hello World");
        String[] splitText3 = node3.splitText(0);
        assertEquals("Hello", splitText3[0].trim());
        assertTrue(splitText3.length == 1);

        text = "a";
        TestTextNodeNode node4 = new TextNodeNode(text, "a");
        String[] splitText4 = node4.splitText(0);
        assertEquals("a", splitText4[0].trim());
    }

    @Test
    public void testTextNodeToString() {
        String text = "Hello World";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        assertEquals("Hello World", node.toString().trim());
    }

    @Test
    public void testTextNodeOuterHtmlHead() throws IOException {
        String text = "";
        TestTextNodeNode node = new TextNodeNode(text, "");
        assertEquals("", node.outerHtmlHead(null, 0, null).trim());
    }

    @Test
    public void testTextNodeOuterHtmlTail() throws IOException {
        String text = "";
        TestTextNodeNode node = new TextNodeNode(text, "");
        assertEquals("", node.outerHtmlTail(null, 0, null).trim());
    }
}

class TextNodeNode {
    private final String text;
    private final String name;

    public TextNodeNode(String text, String name) {
        this.text = text;
        this.name = name;
    }

    public static TestTextNodeNode createFromEncoded(String encodedText) {
        // implementation
    }

    @Override
    public String toString() {
        return "TextNode{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}