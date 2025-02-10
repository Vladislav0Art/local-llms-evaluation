package org.jsoup.nodes;

public class GeneratedTestSplitText splitsString_atZero {

    @Test
    public void testSplitText

    splitsString_atZero() {
        TextNode textNode = new TextNode("abc");
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertNull(textNode.getWholeText());
    }

}