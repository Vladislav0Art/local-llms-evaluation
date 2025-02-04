package org.jsoup.nodes;

public class GeneratedOuterHtml_head_TextNodeIsNotBlank_WritesHead {

    @Test
    public void outerHtml_head_TextNodeIsNotBlank_WritesHead() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        TextNode textNode = new TextNode("word");
        textNode.outerHtmlHead(accum, 0, out);

        verify(accum).write(anyString());
    }

}