package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        assertEquals(2, textNode.splitText(1));
        assertEquals(3, textNode.splitText(4));
    }

}