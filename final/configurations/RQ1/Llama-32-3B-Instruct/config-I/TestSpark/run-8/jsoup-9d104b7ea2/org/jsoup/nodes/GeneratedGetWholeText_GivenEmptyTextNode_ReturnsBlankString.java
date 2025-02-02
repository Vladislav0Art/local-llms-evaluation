package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenEmptyTextNode_ReturnsBlankString {

    @Test
    public void getWholeText_GivenEmptyTextNode_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

}