package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetWithinText_ReturnsNewTextNodeWithCorrectText {

    @Test
    public void splitText_GivenOffsetWithinText_ReturnsNewTextNodeWithCorrectText() {
        String text = "test";
        TextNode node = new TextNode(text);
        int offset = 3;
        TextNode tailNode = node.splitText(offset);
        assertEquals(3, tailNode.text().length());
    }

}