package org.jsoup.nodes;

public class GeneratedNewNodeText_MultipleCharacters_ReturnsMultipleCharactersTextNode {

    @Test
    public void newNodeText_MultipleCharacters_ReturnsMultipleCharactersTextNode() {
        String expected = "abc";
        TextNode actual = new TextNode(expected);
        assertEquals(expected, actual.text());
    }

}