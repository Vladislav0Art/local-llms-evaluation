package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_HandlesNoChildNodes {

    @Test
    public void outerHtmlTail_HandlesNoChildNodes() throws IOException {
        TextNode node = new TextNode("test");
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Document document = mock(Document.class);
        TextNode actual = new TextNode(node).outerHtmlTail(accum, depth, out);
        verify(accum).append(mock(String.class));
    }

}