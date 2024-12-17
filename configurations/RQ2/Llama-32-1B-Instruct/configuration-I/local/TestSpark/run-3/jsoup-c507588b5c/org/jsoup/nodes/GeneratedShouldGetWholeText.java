package org.jsoup.nodes;

public class GeneratedShouldGetWholeText {

    @Test
    public void shouldGetWholeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getText());
    }

}