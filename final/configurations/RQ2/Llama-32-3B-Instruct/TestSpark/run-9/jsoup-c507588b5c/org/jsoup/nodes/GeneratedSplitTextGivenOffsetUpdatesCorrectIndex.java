package org.jsoup.nodes;

public class GeneratedSplitTextGivenOffsetUpdatesCorrectIndex {

    @Test
    public void splitTextGivenOffsetUpdatesCorrectIndex() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 5;
        TextNode result = textNode.splitText(offset);
        assertEquals(6, result.text().length());
    }

}