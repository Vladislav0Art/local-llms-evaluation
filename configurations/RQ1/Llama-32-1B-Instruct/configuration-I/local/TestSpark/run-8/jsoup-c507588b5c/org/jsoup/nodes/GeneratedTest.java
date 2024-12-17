package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank
    returns true when this
    document is
    empty or

    only whitespace() {
        // Arrange
        Document doc = new Document();
        Appendable emptyString = StringUtil.emptyApplicable(doc);
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        boolean result = TextNode.isBlank(emptyString, out);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsBlank
    returns false
    when it
    contains any

    text content() {
        // Arrange
        Document doc = new Document();
        Appendable text1 = "Hello";
        Appendable text2 = "\n\nWorld!";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        boolean result = TextNode.isBlank(text1, out);
        result &= TextNode.isBlank(text2, out);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testSplitText
    splits text
    node at
    offset 0()

    {
        // Arrange
        Document doc = new Document();
        Appendable string1 = "Hello";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = TextNode.splitText(0, out);

        // Assert
        assertEquals("Hello", result.text());
    }

    @Test
    public void testSplitText
    splits text
    node at
    offset greater
    than text

    length() {
        // Arrange
        Document doc = new Document();
        Appendable string1 = "Hello";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = TextNode.splitText(10, out);

        // Assert
        assertEquals("Hello", result.text());
    }

    @Test
    public void testSplitText
    adds sibling
    node to
    the split

    text node() {
        // Arrange
        Document doc = new Document();
        Appendable string1 = "Hello";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = TextNode.splitText(0, out);

        // Assert
        assertEquals("Hello", result.text());
    }

    @Test
    public void testSplitText
    returns original
    text after
    offset if
    no parent

    is present() {
        // Arrange
        Document doc = new Document();
        Appendable string1 = "Hello";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = TextNode.splitText(0, out);

        // Assert
        assertEquals("Hello", result.text());
    }

    @Test
    public void testSplitText
    adds sibling
    node to
    original text if
    no parent

    is present() {
        // Arrange
        Document doc = new Document();
        Appendable string1 = "Hello";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = TextNode.splitText(0, out);

        // Assert
        assertEquals("Hello", result.text());
    }

}