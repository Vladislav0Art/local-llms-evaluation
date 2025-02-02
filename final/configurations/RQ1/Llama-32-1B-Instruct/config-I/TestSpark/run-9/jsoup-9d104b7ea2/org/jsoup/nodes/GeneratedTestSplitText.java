package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test  \n\n");
        TextNode result = textNode.splitText(0);
        assertEquals(new TextNode("test\n\n"), result);
    }

}