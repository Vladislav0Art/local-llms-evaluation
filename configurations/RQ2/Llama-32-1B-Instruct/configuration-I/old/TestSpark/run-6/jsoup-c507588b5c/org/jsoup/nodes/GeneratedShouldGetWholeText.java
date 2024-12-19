package org.jsoup.nodes;

public class GeneratedShouldGetWholeText {

    @Test
    public void shouldGetWholeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getText());
    }

}