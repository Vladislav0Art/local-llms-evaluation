package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_EmptyText_Html {

    @Test
    public void outerHtmlTail_EmptyText_Html() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = null;
        when(out.toString()).thenReturn("");
        when(accum.append(anyString())).thenReturn(accum);
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, depth, out);
    }

}