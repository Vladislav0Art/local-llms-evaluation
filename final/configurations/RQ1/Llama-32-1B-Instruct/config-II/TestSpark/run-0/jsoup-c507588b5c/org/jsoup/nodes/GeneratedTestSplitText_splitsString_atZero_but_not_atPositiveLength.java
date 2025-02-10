package org.jsoup.nodes;

public class GeneratedTestSplitText_splitsString_atZero_but_not_atPositiveLength {

    @Test
    public void testSplitText_splitsString_atZero_but_not_atPositiveLength() {
        TextNode textNode = new TextNode("abc");
        TextNode result = textNode.splitText(1);
        assertNotNull(result);
        assertEquals("abc", result.getText());
        assertNotNull(textNode.getWholeText());
    }

}