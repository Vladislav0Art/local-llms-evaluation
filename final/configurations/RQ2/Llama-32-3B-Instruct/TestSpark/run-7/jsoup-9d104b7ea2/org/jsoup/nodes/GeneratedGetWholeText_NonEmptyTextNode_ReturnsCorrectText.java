package org.jsoup.nodes;

public class GeneratedGetWholeText_NonEmptyTextNode_ReturnsCorrectText {

    @Test
    public void getWholeText_NonEmptyTextNode_ReturnsCorrectText() {
        char[] characters = {'a', 'b'};
        TextNode node = new TextNode(String.valueOf(characters));
        String expected = "ab";
        assertEquals(expected, node.getWholeText());
    }

}