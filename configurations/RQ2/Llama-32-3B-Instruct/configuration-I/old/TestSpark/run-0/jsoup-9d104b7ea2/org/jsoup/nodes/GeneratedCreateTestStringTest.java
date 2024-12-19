package org.jsoup.nodes;

public class GeneratedCreateTestStringTest {

    private String text;

    public TextNode() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static TextNode createTextNode(String encodedText) {
        // implementation of createTextNode method
        return new TextNode();
    }

    public static TextNode createTestString(String text) {
        // implementation of createTestString method
        return new TextNode(text);
    }
}

public class GeneratedTest {

    @Test
    public void createTestStringTest() {
        String text = "Hello";
        TextNode textNode = TextNode.createTestString(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.getText());
    }

}