package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_GivenAppendableAndDepth_ThrowsIOException {

    @Test
    public void outerHtmlHead_GivenAppendableAndDepth_ThrowsIOException() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(appendable, 0, out);
        verify(appendable).append("text", times(1));
    }

}