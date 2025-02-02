package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetAtEndOfText_ReturnsNewTextNodeWithCorrectText {

    @Test
    public void splitText_GivenOffsetAtEndOfText_ReturnsNewTextNodeWithCorrectText() {
        String text = "test";
        TextNode node = new TextNode(text);
        int offset = text.length();
        TextNode tailNode = node.splitText(offset);
        assertEquals(0, tailNode.text().length());
    }

}