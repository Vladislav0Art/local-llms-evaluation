package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public TextNode(String text) {
        this.text = text.trim();
    }

    public String getText() {
        return text;
    }

    public void splitText(int offset) {
        if (offset >= text.length()) {
            throw new IllegalArgumentException("Offset is beyond the length of the text");
        }
        // implement splitting logic here
    }

    public boolean isBlank() {
        return text.isEmpty();
    }
}

public class TextNodeTest {

    @Test
    public void constructorTextNodeText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", textNode.text());
    }

    @Test
    public void textTextNodeValueNormalisesWhitespace() {
        String text = "   Hello   World!  ";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", textNode.text());
    }

    @Test
    public void splitTextSplitAtOffsetReturnsNewTextNodeWithTextBeforeOffset() {
        String text = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode resultTextNode = textNode.splitText(offset);
        assertEquals("Hello", resultTextNode.text());
    }

    @Test
    public void splitTextSplitAtOffsetReturnsNewTextNodeWithTextAfterOffset() {
        String text = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode resultTextNode = textNode.splitText(offset);
        assertEquals("World!", resultTextNode.text());
    }

    @Test
    public void splitTextSplitAtOffsetThrowsIllegalArgumentException() {
        String text = "Hello World!";
        int offset = 10;
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

    @Test
    public void textNodeIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeIsNotBlank() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    private class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public String text() {
            return text;
        }

        public void splitText(int offset) {
            if (offset >= text.length()) {
                throw new IllegalArgumentException("Offset is beyond the length of the text");
            }
            // implement splitting logic here
        }

        public boolean isBlank() {
            return text.isEmpty();
        }
    }

}