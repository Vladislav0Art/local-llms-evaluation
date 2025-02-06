package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_CalledWithEmptyText_NoOutput {

    @Test
    public void outerHtmlHead_CalledWithEmptyText_NoOutput() throws IOException {
        Appendable accum = mock(Appendable.class);
        when(accum.append(anyString())).thenReturn(null);
        TextNode textNode = new TextNode("");
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(out);
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append("<!--").append(textNode.nodeName()).append("-->");
    }

}