package org.jsoup.nodes;

public class GeneratedNewNodeText_EmptyString_ReturnsEmptyTextNode {

    @Test
    public void newNodeText_EmptyString_ReturnsEmptyTextNode() {
        String expected = "";
        TextNode actual = new TextNode(expected);
        assertEquals(expected, actual.text());
    }

}