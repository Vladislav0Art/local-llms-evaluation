package org.jsoup.nodes;

public class GeneratedSetTextNodeText {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void setTextNodeText() {
        TextNode textNode = testTextNode("");
        textNode.setText("Hello");
        assertEquals("Hello", textNode.text());
    }

}