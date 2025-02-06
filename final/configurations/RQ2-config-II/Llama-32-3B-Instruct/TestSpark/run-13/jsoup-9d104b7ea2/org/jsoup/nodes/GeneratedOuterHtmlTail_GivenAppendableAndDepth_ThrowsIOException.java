package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_GivenAppendableAndDepth_ThrowsIOException {

    @Test
    public void outerHtmlTail_GivenAppendableAndDepth_ThrowsIOException() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlTail(appendable, 0, out);
        verify(appendable).append("\n", times(1));
    }

}