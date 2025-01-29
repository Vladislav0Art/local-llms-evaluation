package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        // Arrange
        String expected = "text";
        String actual = (String) org.jsoup.nodes.TextNode.nodeName();

        // Act and Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testText() {
        // Arrange
        String text = "";
        String actual = (String) org.jsoup.nodes.TextNode.text(text);

        // Act and Assert
        assertEquals(text, actual);
    }

    @Test
    public void testGetWholeText() {
        // Arrange
        String expected = "Hello World";
        String text = "Hello World";
        org.jsoup.nodes.TextNode node = new TextNode(text);

        // Act
        String wholeText = node.getWholeText();

        // Assert
        assertEquals(expected, wholeText);
    }

    @Test
    public void testIsBlank() {
        // Arrange
        String text = "";
        boolean actual = (boolean) org.jsoup.nodes.TextNode.isBlank(text);

        // Act and Assert
        assertEquals(true, actual);
    }

    @Test
    public void testSplitText() {
        // Arrange
        int offset = 5;
        String text = "Hello World!";
        org.jsoup.nodes.TextNode node = new TextNode(text);

        // Act
        TextNode result = node.splitText(offset);

        // Assert
        assertEquals("Hello", result.text());
    }

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        String accum = "";
        int depth = 1;
        org.jsoup.nodes.Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(accum, depth, out);

        // Act and Assert
        // No assertions needed for this test method
    }

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        String accum = "";
        int depth = 1;
        org.jsoup.nodes.Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(accum, depth, out);

        // Act and Assert
        // No assertions needed for this test method
    }

    @Test
    public void testToString() {
        // Arrange
        String text = "Hello World!";
        org.jsoup.nodes.TextNode node = new TextNode(text);

        // Act
        String actual = node.toString();

        // Assert
        assertEquals("text", actual);
    }

    @Test
    public void testClone() {
        // Arrange
        org.jsoup.nodes.TextNode node1 = new TextNode("Hello World!");
        org.jsoup.nodes.TextNode node2 = (TextNode) org.jsoup.nodes.TextNode.clone();

        // Act and Assert
        assertEquals(node1, node2);
    }

    @Test
    public void testCreateFromEncoded() {
        // Arrange
        String encodedText = "Hello World!";
        TextNode node = org.jsoup.nodes.TextNode.createFromEncoded(encodedText);

        // Act and Assert
        assertEquals("Hello World!", node.text());
    }

}