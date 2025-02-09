package org.jsoup.nodes;

public class GeneratedText_GetTextReturnsEncodedText {

    private String encodedText;

    public TextNode(String encodedText) {
        this.encodedText = encodedText;
    }

    public String getNodeName() {
        return "TextNode";
    }

    public String getText() {
        return encodedText;
    }

    public String getWholeText() {
        return encodedText;
    }

    public static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void text_GetTextReturnsEncodedText() throws Exception {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertEquals(encodedText, node.getText());
    }

}