package org.jsoup.nodes;

public class GeneratedCreateTextNodeTest {

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
    public void createTextNodeTest() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello");
        assertNotNull(textNode);
        assertEquals("Hello", textNode.getText());
    }

}