package org.jsoup.nodes;

public class GeneratedTestSplitText_splitsString_atPositiveLength {

    @Test
    public void testSplitText_splitsString_atPositiveLength() {
        TextNode textNode = new TextNode("abc");
        TextNode result = textNode.splitText(5);
        assertNotNull(result);
        assertEquals("abc", result.getText());
        assertNotNull(textNode.getWholeText());
    }

}