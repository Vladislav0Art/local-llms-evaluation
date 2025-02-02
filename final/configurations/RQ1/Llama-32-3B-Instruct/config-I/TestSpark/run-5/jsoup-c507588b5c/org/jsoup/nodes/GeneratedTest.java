package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getWholeText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void createTextNode_SingleChar_ReturnsTextNode() {
        TextNode textNode = new TextNode();
        textNode.setText("a");
        assertNotNull(textNode);
    }

    @Test
    public void createTextNode_EmptyString_ReturnsEmptyTextNode() {
        TextNode textNode = new TextNode();
        assertTrue(textNode.getWholeText().isEmpty());
    }

    @Test
    public void createTextNode_NullText_ThrowsNullPointerException() {
        try {
            new TextNode();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void text_ReturnsRawTextValue() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setText(text);
        assertEquals(text, textNode.getText());
    }

    @Test
    public void setText_SettingTextReturnsTextNode() {
        TextNode textNode = new TextNode();
        textNode.setText("New Text");
        assertEquals("New Text", textNode.getWholeText());
    }

    @Test
    public void getWholeText_ReturnsRawTextValue() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setText(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsTrueForEmptyTextNode() {
        TextNode textNode = new TextNode();
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsFalseForNonEmptyTextNode() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello, World!");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplittingAtOffset_ReturnsNewTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setText(text);
        assertEquals("World!", textNode.splitText(text.length()).getWholeText());
    }
}

public class Document {
    public static class OutputSettings {
    }

    public static class Appendable extends java.io.Appendable {

        @Override
        public void append(String value) throws IOException {
            // implement append logic
        }

        @Override
        public void append(CharSequence csq, int start, int end) throws IOException {
            // implement append logic
        }
    }

}