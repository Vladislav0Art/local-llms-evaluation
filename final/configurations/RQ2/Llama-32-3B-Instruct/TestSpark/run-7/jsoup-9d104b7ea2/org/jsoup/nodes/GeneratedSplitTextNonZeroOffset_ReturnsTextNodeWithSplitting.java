package org.jsoup.nodes;

public class GeneratedSplitTextNonZeroOffset_ReturnsTextNodeWithSplitting {

    @Test
    public void splitTextNonZeroOffset_ReturnsTextNodeWithSplitting() {
        String original = "Hello World!";
        char[] characters = {'a', 'b'};
        TextNode node = new TextNode(String.valueOf(characters));
        String expected1 = "Hell";
        String expected2 = "o World!";
        int offset = 5;
        TextNode actual = node.splitText(offset);
        assertEquals(expected1, actual.text());
    }

}