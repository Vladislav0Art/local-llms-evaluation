package org.jsoup.nodes;

public class GeneratedIsBlank_IsBlank_ReturnsFalseForNonEmptyString {

    @Test
    public void isBlank_IsBlank_ReturnsFalseForNonEmptyString() {
        String text = "test";
        assertFalse(TextNode.isBlank(text));
    }
}

public class TextNode {

    private String encodedText;

    public TextNode(String encodedText) {
        thisencodedText = encodedText;
    }

    public String getWholeText() {
        return encodedText;
    }

    public void setText(String text) {
        this.encodedText = text;
    }

    public static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

}