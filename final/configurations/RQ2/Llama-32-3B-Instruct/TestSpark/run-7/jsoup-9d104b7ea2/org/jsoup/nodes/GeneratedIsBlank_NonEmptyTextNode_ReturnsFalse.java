package org.jsoup.nodes;

public class GeneratedIsBlank_NonEmptyTextNode_ReturnsFalse {

    @Test
    public void isBlank_NonEmptyTextNode_ReturnsFalse() {
        char[] characters = {'a', 'b'};
        TextNode node = new TextNode(String.valueOf(characters));
        boolean expected = false;
        assertEquals(expected, node.isBlank());
    }

}