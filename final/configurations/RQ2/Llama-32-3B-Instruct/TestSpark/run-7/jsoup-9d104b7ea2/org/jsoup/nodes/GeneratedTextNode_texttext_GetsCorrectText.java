package org.jsoup.nodes;

public class GeneratedTextNode_texttext_GetsCorrectText {

    @Test
    public void textNode_texttext_GetsCorrectText() {
        char[] characters = {'a', 'b'};
        TextNode node = new TextNode(String.valueOf(characters));
        String expected = "ab";
        assertEquals(expected, node.text());
    }

}