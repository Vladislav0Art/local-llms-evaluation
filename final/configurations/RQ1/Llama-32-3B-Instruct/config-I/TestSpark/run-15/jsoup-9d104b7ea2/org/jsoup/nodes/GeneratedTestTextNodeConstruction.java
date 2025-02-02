package org.jsoup.nodes;

public class GeneratedTestTextNodeConstruction {

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
    public void testTextNodeConstruction() {
        String text = "ab c";
        TextNode node = new TextNode();
        node.setText(text);
        assertEquals("ab c", node.getText());
    }

}