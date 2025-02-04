package org.jsoup.nodes;

public class GeneratedOuterHtml_head_isIndentedIfPrettyPrintedAndIsBlock {

    @Test
    public void outerHtml_head_isIndentedIfPrettyPrintedAndIsBlock() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        Comment comment = new Comment("Data");
        when(comment.outerHtmlHead(accum, depth, out)).thenReturn("");
        when(out.prettyPrint()).thenReturn(true);
        Element parent = mock(Element.class);
        when(parent.tag()).thenReturn(new Tag("#parent"));
        when(parent instanceof Element).thenReturn(true);
        when(parent.tagName()).thenReturn("block").thenReturn("#comment");
        comment.set parentNode (parent);
        assertEquals(0, accum.size());
    }

}