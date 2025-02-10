package org.jsoup.nodes;

public class GeneratedSplitText_WhenOffsetIsPositive {

    @Test
    public void splitText_WhenOffsetIsPositive() {
        TextNode node = new TextNode("Hello");
        assertEquals(" Hello", node.splitText(1).getWholeText());
    }

}