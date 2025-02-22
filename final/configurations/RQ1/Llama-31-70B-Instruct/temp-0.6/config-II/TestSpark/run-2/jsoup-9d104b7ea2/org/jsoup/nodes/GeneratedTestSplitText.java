package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test text");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("test ", textNode.getWholeText());
        assertEquals("text", tailNode.getWholeText());
    }

}