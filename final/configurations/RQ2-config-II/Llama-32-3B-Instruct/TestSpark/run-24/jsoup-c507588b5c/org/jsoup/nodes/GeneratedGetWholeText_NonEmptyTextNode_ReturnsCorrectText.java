package org.jsoup.nodes;

public class GeneratedGetWholeText_NonEmptyTextNode_ReturnsCorrectText {

    @Test
    public void getWholeText_NonEmptyTextNode_ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

}