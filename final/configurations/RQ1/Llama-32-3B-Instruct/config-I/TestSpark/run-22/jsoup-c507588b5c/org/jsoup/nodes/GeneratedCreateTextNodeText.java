package org.jsoup.nodes;

public class GeneratedCreateTextNodeText {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void createTextNodeText() {
        TextNode textNode = testTextNode("Hello");
        assertEquals("Hello", textNode.text());
    }

}