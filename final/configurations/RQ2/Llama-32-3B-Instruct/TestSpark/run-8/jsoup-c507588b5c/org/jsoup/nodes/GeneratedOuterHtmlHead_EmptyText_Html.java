package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_EmptyText_Html {

    @Test
    public void outerHtmlHead_EmptyText_Html() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = null;
        when(out.toString()).thenReturn("");
        when(out.toString(deep(0))).thenReturn("<span>");
        when(accum.append(anyString())).thenReturn(accum);
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, depth, out);
    }

}