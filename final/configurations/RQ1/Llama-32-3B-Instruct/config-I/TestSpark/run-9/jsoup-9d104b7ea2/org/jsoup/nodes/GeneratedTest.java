package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class Document {
    public static class OutputSettings {
        public OutputSettings(boolean noWrap, boolean prettyPrint) {
        }
    }

    public static class GeneratedTest {

    }
}

public class TextNodeTest {

    @Test
    public void createTextNode_ReturnsTextNode() {
        // Arrange

        // Act and Assert
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setValue(text);
        assertEquals("Hello, World!", textNode.getValue());
    }

    @Test
    public void nodeName_ReturnsCorrectString() {
        // Arrange

        // Act and Assert
        TextNode textNode = new TextNode();
        textNode.setValue("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsUnencodedText() {
        // Arrange

        // Act and Assert
        String originalText = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setValue(originalText);
        assertEquals(originalText, textNode.text());
    }

    @Test
    public void textSetsCorrectValue() {
        // Arrange

        // Act and Assert
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setValue(text);
        assertEquals(text, textNode.getValue());
    }

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        // Arrange

        // Act and Assert
        String originalText = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setValue(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsCorrectBoolean() {
        // Arrange

        // Act and Assert
        boolean result = true;
        TextNode textNode = new TextNode();
        textNode.setValue("");
        assertEquals(result, textNode.isBlank());

        result = false;
        textNode = new TextNode();
        textNode.setValue("Hello");
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitText_SplitsCorrectly() {
        // Arrange

        // Act and Assert
        String originalText = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode();
        textNode.setValue(originalText);

        TextNode expectedText = new TextNode();
        expectedText.setValue("World");
        when(textNode.getValue()).thenReturn(originalText.substring(0, offset));
        assertEquals(expectedText, textNode.splitText(offset).text());
    }

    @Test
    public void outerHtmlHead_SetsCorrectHtml() {
        // Arrange

        // Act and Assert
        String html = "<html><body>Hello</body></html>";
        when(TextNode.class, "getValue").thenReturn(html);
        TextNode textNode = new TextNode();
        assertEquals("<p>Hello</p>", textNode.outerHtml());
    }

    @Test
    public void outerHtml_SetsCorrectHtml() {
        // Arrange

        // Act and Assert
        String html = "<html><body>Hello</body></html>";
        when(TextNode.class, "getValue").thenReturn(html);
        TextNode textNode = new TextNode();
        assertEquals("<p>Hello</p>", textNode.outerHtml());
    }

}