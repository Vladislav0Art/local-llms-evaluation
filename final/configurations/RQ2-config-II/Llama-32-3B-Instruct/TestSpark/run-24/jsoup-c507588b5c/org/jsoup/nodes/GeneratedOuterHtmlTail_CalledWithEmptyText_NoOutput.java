package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_CalledWithEmptyText_NoOutput {

    @Test
    public void outerHtmlTail_CalledWithEmptyText_NoOutput() {
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("");
        Document.OutputSettings out = new Document.OutputSettings();
        document.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}