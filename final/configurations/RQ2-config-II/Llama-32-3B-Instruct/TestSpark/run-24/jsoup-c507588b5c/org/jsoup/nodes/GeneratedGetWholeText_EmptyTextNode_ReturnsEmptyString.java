package org.jsoup.nodes;

public class GeneratedGetWholeText_EmptyTextNode_ReturnsEmptyString {

    @Test
    public void getWholeText_EmptyTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

}