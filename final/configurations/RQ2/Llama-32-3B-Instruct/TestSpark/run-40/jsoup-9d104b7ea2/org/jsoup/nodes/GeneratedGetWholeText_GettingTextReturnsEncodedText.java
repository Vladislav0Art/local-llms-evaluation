package org.jsoup.nodes;

public class GeneratedGetWholeText_GettingTextReturnsEncodedText {

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
    public void getWholeText_GettingTextReturnsEncodedText() throws Exception {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertEquals(encodedText, node.getWholeText());
    }

}