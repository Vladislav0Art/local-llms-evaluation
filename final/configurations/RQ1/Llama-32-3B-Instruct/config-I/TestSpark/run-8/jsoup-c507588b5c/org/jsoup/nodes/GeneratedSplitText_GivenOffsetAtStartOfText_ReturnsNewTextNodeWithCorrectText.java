package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetAtStartOfText_ReturnsNewTextNodeWithCorrectText {

    @Test
    public void splitText_GivenOffsetAtStartOfText_ReturnsNewTextNodeWithCorrectText() {
        String text = "test";
        TextNode node = new TextNode(text);
        int offset = 0;
        TextNode headNode = node.splitText(offset);
        assertEquals(1, headNode.text().length());
    }

}