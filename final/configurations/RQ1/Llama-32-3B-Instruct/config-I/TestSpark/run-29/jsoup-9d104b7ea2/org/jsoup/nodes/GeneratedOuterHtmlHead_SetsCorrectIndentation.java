package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_SetsCorrectIndentation {

    @Mock
    private org.jsoup.nodes LeafNode
    parentNode;

    public TextNodeTest() {
    }

    @Test
    public void outerHtmlHead_SetsCorrectIndentation() {
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = (TextNode) this.createTextNode(TEXT_NODE_VALUE);
        Appendable accum = org.mockito.Mockito.mock(Appendable.class);

        textNode.outerHtmlHead(accum, 1, out);

        org.mockito.Mockito.verify(accum).append(Mockito.anyString());
    }

}