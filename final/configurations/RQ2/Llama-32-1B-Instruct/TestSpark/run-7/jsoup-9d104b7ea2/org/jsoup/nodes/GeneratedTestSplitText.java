package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals(2, textNode.splitText(0));
        assertEquals(1, textNode.splitText(5));
        assertEquals(3, textNode.splitText(8));
    }

}