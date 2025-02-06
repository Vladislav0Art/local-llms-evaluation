package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenTextNode_ReturnsCorrectText {

    @Test
    public void getWholeText_GivenTextNode_ReturnsCorrectText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}