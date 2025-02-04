package org.jsoup.nodes;

public class GeneratedOuterHtml_head_TextNodeIsBlank_NeverWritesHead {

    @Test
    public void outerHtml_head_TextNodeIsBlank_NeverWritesHead() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(accum, 0, out);

        verify(accum, never()).write(anyString());
    }

}