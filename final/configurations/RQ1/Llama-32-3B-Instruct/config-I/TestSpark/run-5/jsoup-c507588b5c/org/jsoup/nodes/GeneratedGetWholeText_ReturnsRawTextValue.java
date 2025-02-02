package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsRawTextValue {

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
    public void getWholeText_ReturnsRawTextValue() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setText(text);
        assertEquals(text, textNode.getWholeText());
    }

}