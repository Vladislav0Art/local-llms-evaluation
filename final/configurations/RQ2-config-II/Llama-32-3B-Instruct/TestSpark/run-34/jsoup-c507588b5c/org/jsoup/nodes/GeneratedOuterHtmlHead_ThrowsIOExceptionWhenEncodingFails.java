package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_ThrowsIOExceptionWhenEncodingFails {

    @Test
    public void outerHtmlHead_ThrowsIOExceptionWhenEncodingFails() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(OutputMode.XML);
        TextNode node = new TextNode("Hello");
        assertThrows(IOException.class, () -> node.outerHtmlHead(accum, 0, out));
    }

}