package org.jsoup.nodes;

public class GeneratedCloneTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void cloneTest() {
        // Mock Document to avoid actual implementation
        Document document = mock(Document.class);

        TextNode node = new TextNode(WHITESPACE);
        TextNode clonedNode = node.clone();

        Assert.assertSame(node, clonedNode);
    }

}