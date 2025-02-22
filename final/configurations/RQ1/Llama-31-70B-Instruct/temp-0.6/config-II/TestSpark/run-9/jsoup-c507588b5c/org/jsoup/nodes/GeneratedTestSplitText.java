package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Some text");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("Some", textNode.coreValue());
        assertEquals(" text", tailNode.coreValue());
    }

}