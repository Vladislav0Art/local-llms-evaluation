package org.jsoup.nodes;

public class GeneratedGetWholeText {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void getWholeText() {
        TextNode textNode = testTextNode("Hello World!");
        assertEquals("Hello World!", textNode.getWholeText().text());
    }

}