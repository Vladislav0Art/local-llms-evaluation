package org.jsoup.nodes;

public class GeneratedSplitText_WhenSplitAtWhitespace {

    @Test
    public void splitText_WhenSplitAtWhitespace() {
        TextNode node = new TextNode("   Hello  World");
        TextNode firstChild = node.splitText(0);
        TextNode secondChild = firstChild.splitText(1);
        assertEquals(firstChild.getWholeText(), "   ");
        assertEquals(secondChild.getWholeText(), "Hello World");
    }

}