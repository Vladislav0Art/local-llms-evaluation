package org.jsoup.nodes;

public class GeneratedSplitText_SplitsCorrectly {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void splitText_SplitsCorrectly() {
        org.jsoup.nodes.TextNode textNode = (org.jsoup.nodes.TextNode) this.createTextNode(TEXT_NODE_VALUE);
        org.jsoup.nodes.TextNode tailNode = textNode.splitText(SPLIT_OFFSET);
        org.junit.Assert.assertNotNull(tailNode);

        org.junit.Assert.assertEquals(SPLIT_OFFSET, tailNode.getWholeText().length());
    }

}