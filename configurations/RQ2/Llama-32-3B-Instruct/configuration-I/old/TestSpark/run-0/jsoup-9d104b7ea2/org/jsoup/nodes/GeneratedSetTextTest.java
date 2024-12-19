package org.jsoup.nodes;

public class GeneratedSetTextTest {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void setTextTest() {
        String text = "Hello";
        TextNode textNode = new TextNode();
        textNode.setText(text);
        assertEquals(text, textNode.getText());
    }

}