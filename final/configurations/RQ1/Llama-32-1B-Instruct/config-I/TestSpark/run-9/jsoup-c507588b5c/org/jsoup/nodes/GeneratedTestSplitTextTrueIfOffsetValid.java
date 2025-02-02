package org.jsoup.nodes;

public class GeneratedTestSplitTextTrueIfOffsetValid {

    @Test
    public void testSplitTextTrueIfOffsetValid() {
        TextNode textNode = new TextNode("   Hello ");
        TextNode result = textNode.splitText(5);
        assertEquals("Hello ", result.text());
    }

}