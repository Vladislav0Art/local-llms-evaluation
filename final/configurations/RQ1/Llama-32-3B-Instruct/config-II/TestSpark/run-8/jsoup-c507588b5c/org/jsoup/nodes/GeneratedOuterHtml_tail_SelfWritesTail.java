package org.jsoup.nodes;

public class GeneratedOuterHtml_tail_SelfWritesTail {

    @Test
    public void outerHtml_tail_SelfWritesTail() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        TextNode textNode = new TextNode("word");
        textNode.outerHtmlTail(accum, 0, out);

        verify(accum).write(anyString());
    }

}