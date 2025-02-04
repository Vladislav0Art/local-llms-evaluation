package org.jsoup.nodes;

public class GeneratedSplitTextGivenOffsetGreaterOrEqualTextNodeLength_ReturnsTextNodeWithCorrectText {

    @Test
    public void splitTextGivenOffsetGreaterOrEqualTextNodeLength_ReturnsTextNodeWithCorrectText() throws IOException {
        TextNode node = new TextNode("hello world");
        int offset = 11;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertEquals("", result.value());
    }

}