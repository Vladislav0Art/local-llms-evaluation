package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_NonEmptyString_ReturnsCorrectTextNode {

    @Test
    public void createFromEncoded_NonEmptyString_ReturnsCorrectTextNode() {
        char[] characters = {'a', 'b'};
        String encoded = "abc";
        TextNode expected = new TextNode(String.valueOf(characters));
        assertSame(expected, TextNode.createFromEncoded(encoded));
    }

}