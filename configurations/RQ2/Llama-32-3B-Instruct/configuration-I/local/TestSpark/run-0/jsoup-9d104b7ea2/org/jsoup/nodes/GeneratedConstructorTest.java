package org.jsoup.nodes;

public class GeneratedConstructorTest {

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
    public void constructorTest() {
        TextNode textNode = new TextNode();
        assertNotNull(textNode);
        assertEquals("", textNode.getText());
    }

}