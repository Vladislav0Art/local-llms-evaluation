package org.jsoup.nodes;

public class GeneratedSplitTextZeroOffset_ReturnsOriginalTextNode {

    @Test
    public void splitTextZeroOffset_ReturnsOriginalTextNode() {
        String original = "Hello World!";
        TextNode originalNode = new TextNode(original);
        String expected = original;
        TextNode actual = originalNode.splitText(0);
        assertEquals(expected, actual.text());
    }

}