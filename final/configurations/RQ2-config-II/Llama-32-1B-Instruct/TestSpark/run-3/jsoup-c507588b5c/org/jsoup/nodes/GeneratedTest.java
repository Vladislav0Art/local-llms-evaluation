package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void test

    nodeName() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String nodeName = TextNode.nodeName(document, accum);

        // Assert
        assertEquals("HTML", nodeName);
    }

    @Test
    public void test

    text() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String textContent = TextNode.text(document, accum);

        // Assert
        assertEquals("Hello, World!", textContent);
    }

    @Test
    public void test

    textWithSpaces() {
        // Arrange
        String text = " Hello   World";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String textContent = TextNode.text(document, accum);

        // Assert
        assertEquals("Hello  World", textContent);
    }

    @Test
    public void test

    getWholeText() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String wholeText = TextNode.getWholeText(document, accum);

        // Assert
        assertEquals("Hello, World!", wholeText);
    }

    @Test
    public void test

    isBlank() {
        // Arrange
        String text = "   Hello  World";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        boolean blank = TextNode.isBlank(document, accum);

        // Assert
        assertTrue(blank);
    }

    @Test
    public void test

    splitText() {
        // Arrange
        String text = "Hello   World";
        Document document = new Document();
        Appendable accum1 = new StringBuilder();
        Appendable accum2 = new StringBuilder();

        // Act
        TextNode splitText = TextNode.splitText(document, 3);

        // Assert
        assertTrue(splitText.text(0).equals("Hello"));
        assertTrue(splitText.text(1).equals("   "));
        assertTrue(splitText.text(2).equals("World"));
    }

    @Test
    public void test

    outerHtmlHead() {
        // Arrange
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode outerHtmlHead = TextNode.outerHtmlHead(document, 0, null);

        // Assert
        assertTrue(outerHtmlHead.isBlank());
    }

    @Test
    public void test

    toString() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String textContent = TextNode.toString(document, accum);

        // Assert
        assertEquals("HTML", textContent);
    }

    @Test
    public void test

    clone() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode cloned = TextNode.clone(document, accum);

        // Assert
        assertTrue(cloned.text("Hello, World!").equals(text));
    }

    @Test
    public void test

    createFromEncoded() {
        // Arrange
        String encodedText = "hello, world!";
        Document document = new Document();

        // Act
        TextNode textNode = TextNode.createFromEncoded(document, encodedText);

        // Assert
        assertTrue(textNode.text("hello, world!").equals(encodedText));
    }

    @Test
    public void test

    normaliseWhitespace() {
        // Arrange
        String text = "   hello  world";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode normaliseWhitespace = TextNode.normaliseWhitespace(document, accum);

        // Assert
        assertTrue(normaliseWhitespace.text().equals("hello  world"));
    }

    @Test
    public void test

    stripLeadingWhitespace() {
        // Arrange
        String text = "   hello  world";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode stripLeadingWhitespace = TextNode.stripLeadingWhitespace(document, accum);

        // Assert
        assertTrue(stripLeadingWhitespace.text().equals("hello  world"));
    }

    @Test
    public void test

    lastCharIsWhitespace() {
        // Arrange
        String text = "   Hello World";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode lastCharIsWhitespace = TextNode.lastCharIsWhitespace(document, accum);

        // Assert
        assertTrue(lastCharIsWhitespace.text().equals("World"));
    }

}