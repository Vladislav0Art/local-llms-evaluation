package org.jsoup.nodes;

public class GeneratedCreateTextStringTest {

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
    public void createTextStringTest() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.getText());
    }

}