package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "   Hello   World  ";
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(6);
        assertEquals(tailNode, textNode);
        assertNotNull(tailNode.getWholeText());
        assertTrue(tailNode.isBlank());
    }

}