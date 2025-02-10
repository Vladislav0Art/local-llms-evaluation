package org.jsoup.nodes;

public class GeneratedSplitText_WhenSplitAtBlankLine {

    @Test
    public void splitText_WhenSplitAtBlankLine() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode firstChild = node.splitText(0);
        TextNode secondChild = firstChild.splitText(1);
        assertEquals(firstChild.getWholeText(), "Hello");
        assertEquals(secondChild.getWholeText(), " World");
    }

}