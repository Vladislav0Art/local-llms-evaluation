package org.jsoup.nodes;

public class GeneratedShouldGetText {

    @Test
    public void shouldGetText() {
        TextNode textNode = new TextNode("<p>Hello World</p>");
        assertEquals("<p>Hello World</p>", textNode.getText());
    }

}