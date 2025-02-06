package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_DoesNotThrowIOExceptionWhenEncodingSucceeds {

    @Test
    public void outerHtmlTail_DoesNotThrowIOExceptionWhenEncodingSucceeds() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, 0, out);
        assertDoesNotThrow(() -> node.outerHtmlTail(accum, 0, out));
    }

}