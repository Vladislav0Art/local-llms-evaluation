package org.jsoup.nodes;

public class GeneratedNewNodeText_SingleCharacter_ReturnsSingleCharacterTextNode {

    @Test
    public void newNodeText_SingleCharacter_ReturnsSingleCharacterTextNode() {
        char[] characters = {'a'};
        TextNode actual = new TextNode(String.valueOf(characters));
        assertEquals("a", actual.text());
    }

}