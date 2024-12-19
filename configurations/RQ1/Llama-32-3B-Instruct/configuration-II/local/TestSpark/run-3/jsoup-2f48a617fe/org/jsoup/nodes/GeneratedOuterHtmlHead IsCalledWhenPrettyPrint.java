package org.jsoup.nodes;

public class GeneratedOuterHtmlHead IsCalledWhenPrettyPrint {

    @Test
    public void outerHtmlHead

    IsCalledWhenPrettyPrint() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(anyString());
    }

}