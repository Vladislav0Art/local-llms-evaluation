package org.jsoup.nodes;

public class GeneratedSplitText_WhenSplitAtNewline {

    @Test
    public void splitText_WhenSplitAtNewline() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode firstChild = node.splitText(0);
        TextNode secondChild = firstChild.splitText(1);
        assertEquals(firstChild.getWholeText(), "Hello");
        assertEquals(secondChild.getWholeText(), "World\n");
    }

}