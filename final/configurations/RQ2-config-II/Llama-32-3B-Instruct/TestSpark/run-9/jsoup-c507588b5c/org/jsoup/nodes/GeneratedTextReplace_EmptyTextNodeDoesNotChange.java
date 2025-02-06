package org.jsoup.nodes;

public class GeneratedTextReplace_EmptyTextNodeDoesNotChange {

    @Test
    public void textReplace_EmptyTextNodeDoesNotChange() {
        TextNode textNode = new TextNode("");
        textNode = (TextNode) textNode.text("");
        assertEquals("", textNode.text());
    }

}