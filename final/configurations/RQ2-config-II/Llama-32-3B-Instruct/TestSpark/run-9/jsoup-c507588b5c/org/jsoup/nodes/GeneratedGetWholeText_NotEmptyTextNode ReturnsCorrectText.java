package org.jsoup.nodes;

public class GeneratedGetWholeText_NotEmptyTextNode ReturnsCorrectText {

    @Test
    public void getWholeText_NotEmptyTextNode

    ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.getWholeText());
    }

}