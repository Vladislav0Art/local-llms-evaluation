package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("text");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", splitNode.getWholeText());
    }

}