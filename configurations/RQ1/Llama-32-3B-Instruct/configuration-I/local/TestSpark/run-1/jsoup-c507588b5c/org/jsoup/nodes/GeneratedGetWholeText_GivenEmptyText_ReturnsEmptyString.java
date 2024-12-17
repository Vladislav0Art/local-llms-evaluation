package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenEmptyText_ReturnsEmptyString {

    @Test
    public void GetWholeText_GivenEmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

}