package org.jsoup.nodes;

public class GeneratedTestSplitTextOffset {

    private Appendable mockAppendable;
    private Document mockDocument;

    @Test
    public void testSplitTextOffset() {
        TextNode node = new TextNode("Hello World! This is a test.");
        assertEquals(12, node.splitText(7).getWholeText().length());
    }

}