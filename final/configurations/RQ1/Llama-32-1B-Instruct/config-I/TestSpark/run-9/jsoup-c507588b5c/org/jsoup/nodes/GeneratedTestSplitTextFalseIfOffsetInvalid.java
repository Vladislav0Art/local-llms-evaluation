package org.jsoup.nodes;

public class GeneratedTestSplitTextFalseIfOffsetInvalid {

    @Test
    public void testSplitTextFalseIfOffsetInvalid() {
        TextNode textNode = new TextNode("   Hello world");
        TextNode result = textNode.splitText(-1); // -1 is 0-based index
        assertNull(result);
    }

}