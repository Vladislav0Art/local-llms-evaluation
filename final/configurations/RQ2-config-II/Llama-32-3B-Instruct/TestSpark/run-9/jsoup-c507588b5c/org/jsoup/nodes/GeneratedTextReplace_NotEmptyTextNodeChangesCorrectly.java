package org.jsoup.nodes;

public class GeneratedTextReplace_NotEmptyTextNodeChangesCorrectly {

    @Test
    public void textReplace_NotEmptyTextNodeChangesCorrectly() {
        TextNode textNode = new TextNode("Hello");
        textNode = (TextNode) textNode.text("World");
        assertEquals("World", textNode.text());
    }

}