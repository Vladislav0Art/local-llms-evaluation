package org.jsoup.nodes;

public class GeneratedCreateTextNodeBlank {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void createTextNodeBlank() {
        TextNode textNode = testTextNode("");
        assertTrue(textNode.isBlank());
    }

}