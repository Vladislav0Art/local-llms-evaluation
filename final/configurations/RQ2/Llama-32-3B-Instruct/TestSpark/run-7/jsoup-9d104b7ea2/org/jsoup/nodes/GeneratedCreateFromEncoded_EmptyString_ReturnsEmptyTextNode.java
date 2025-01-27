package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_EmptyString_ReturnsEmptyTextNode {

    @Test
    public void createFromEncoded_EmptyString_ReturnsEmptyTextNode() {
        String encoded = "";
        TextNode expected = new TextNode("");
        assertSame(expected, TextNode.createFromEncoded(encoded));
    }

}