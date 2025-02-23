package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("some text");
        TextNode splitNode = textNode.splitText(5);
        assertEquals(textNode.getWholeText(), "some ");
        assertEquals(splitNode.getWholeText(), "text");
    }

}