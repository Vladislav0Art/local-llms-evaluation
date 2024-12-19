package org.jsoup.nodes;

public class GeneratedShouldNotSplitText {

    @Test
    public void shouldNotSplitText() {
        TextNode textNode = new TextNode("<p>Hello World</p>");
        assertEquals("<p>Hello World</p>", textNode.getText());
    }

}