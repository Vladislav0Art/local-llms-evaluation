package org.jsoup.nodes;

public class GeneratedSplitTextGivenOffsetGreaterThanZero_ReturnsTextNodeWithCorrectText {

    @Test
    public void splitTextGivenOffsetGreaterThanZero_ReturnsTextNodeWithCorrectText() throws IOException {
        TextNode node = new TextNode("hello world");
        int offset = 6;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertEquals("world", result.value());
    }

}