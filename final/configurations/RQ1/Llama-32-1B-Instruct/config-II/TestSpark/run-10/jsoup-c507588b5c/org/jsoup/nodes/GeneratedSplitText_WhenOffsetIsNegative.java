package org.jsoup.nodes;

public class GeneratedSplitText_WhenOffsetIsNegative {

    @Test
    public void splitText_WhenOffsetIsNegative() {
        TextNode node = new TextNode("Hello");
        assertEquals(0, node.splitText(-1).getWholeText().length());
    }

}