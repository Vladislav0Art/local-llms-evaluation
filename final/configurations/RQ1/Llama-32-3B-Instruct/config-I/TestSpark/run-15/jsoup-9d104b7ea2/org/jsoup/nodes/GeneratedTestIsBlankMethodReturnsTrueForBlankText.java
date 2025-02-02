package org.jsoup.nodes;

public class GeneratedTestIsBlankMethodReturnsTrueForBlankText {

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
    public void testIsBlankMethodReturnsTrueForBlankText() {
        String text = "";
        TextNode node = new TextNode();
        node.setText(text);
        assertTrue(node.isBlank());
    }

}