package org.jsoup.nodes;

public class GeneratedTest {

    private static String text = "Hello World";

    @Test
    public void testIsBlank() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);

        // Act
        boolean result = TextNode.isBlank(appendable);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testSplitText() {
        // Arrange
        String text = "Hello World";
        int offset = 5;
        Appendable appendable = document.append(text);

        Document.OutputSettings settings = new Document.OutputSettings();
        settings.setPrettyPrint(false);
        settings.setIndentOut(true, 0);

        TextNode.TextNode splitNode = TextNode.splitText(offset, appendable, settings);

        // Act
        appendable.clear();

        // Assert
        assertEquals("Hello", text.substring(5));
    }

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.setPrettyPrint(false);

        TextNode.TextNode headNode = TextNode.createFromEncoded("div {\n  text: 'Hello World'; }\n");
        headNode.setText();

        // Act
        document.open(appendable, "div", settings);
        appendable.append("\n");
        appendable.append(text);
        appendable.append("\n");
        appendable.close();
        appendable.clear();

        // Assert
        assertEquals("text: 'Hello World';\n", document.outerHtml().trim());
    }

    @Test
    public void testOuterHtmlHeadTrimLeading() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.setPrettyPrint(false);

        TextNode.TextNode headNode = TextNode.createFromEncoded("div {\n  text: 'Hello World'; }\n");
        headNode.setText();

        // Act
        document.open(appendable, "div", settings);
        appendable.append("\n");
        appendable.append(text);
        appendable.append("\n");
        appendable.close();
        appendable.clear();
        appendable = document.append(headNode.getWholeText());

        // Assert
        assertEquals("Hello World\n", appendable.toString().trim());
    }

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);
        Document.OutputSettings settings = new Document.OutputSettings();

        TextNode.TextNode tailNode = TextNode.createFromEncoded("div {\n  text: 'Hello World'; }\n");
        tailNode.setText();

        // Act
        document.open(appendable, "div", settings);
        appendable.append("\n");
        appendable.append(text);
        appendable.append("\n");
        appendable.close();
        appendable.clear();
        appendable = document.append(tailNode.getWholeText());

        // Assert
        assertEquals("text: 'Hello World';\n", appendable.toString().trim());
    }

    @Test
    public void testToString() {
        // Act
        String result = TextNode.toString();

        // Assert
        assertEquals("Hello World", result);
    }

}