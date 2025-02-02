package org.jsoup.nodes;

public class GeneratedSplitText_SplitOffsetMax_ReturnsCorrectResult {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void splitText_SplitOffsetMax_ReturnsCorrectResult() {
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode(TEXT_NODE_VALUE);
        org.jsoup.nodes.TextNode tailNode = textNode.splitText(SPLIT_OFFSET_MAX);
        org.junit.Assert.assertNotNull(tailNode);

        org.junit.Assert.assertEquals(SPLIT_OFFSET_MAX, tailNode.getWholeText().length());
    }

}