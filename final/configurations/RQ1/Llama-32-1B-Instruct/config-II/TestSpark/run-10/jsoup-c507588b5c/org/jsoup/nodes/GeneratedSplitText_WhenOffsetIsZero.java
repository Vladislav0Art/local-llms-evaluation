package org.jsoup.nodes;

public class GeneratedSplitText_WhenOffsetIsZero {

    @Test
    public void splitText_WhenOffsetIsZero() {
        TextNode node = new TextNode("   ");
        assertEquals("", node.splitText(0).getWholeText());
    }

}