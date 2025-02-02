package org.jsoup.nodes;

public class GeneratedTestTextNodeCreationFromEncodedString {

    private String text;

    public TextNode() {
    }

    public static TextNode createTextNodeFromEncoded(String encodedText) {
        return new TextNode(encodedText);
    }

    public String getText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void testTextNodeCreationFromEncodedString() {
        String encodedText = "&lt;";
        TextNode node = TextNode.createTextNodeFromEncoded(encodedText);
        assertEquals("&lt;", node.getText());
    }

}