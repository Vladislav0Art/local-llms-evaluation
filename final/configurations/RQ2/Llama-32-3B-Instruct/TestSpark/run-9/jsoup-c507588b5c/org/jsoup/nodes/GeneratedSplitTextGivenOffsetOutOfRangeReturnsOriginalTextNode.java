package org.jsoup.nodes;

public class GeneratedSplitTextGivenOffsetOutOfRangeReturnsOriginalTextNode {

    @Test
    public void splitTextGivenOffsetOutOfRangeReturnsOriginalTextNode() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 100;
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

}