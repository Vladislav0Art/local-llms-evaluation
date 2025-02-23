package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("some text");
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("some ", textNode.getWholeText());
        assertEquals("text", splitTextNode.getWholeText());
    }

}