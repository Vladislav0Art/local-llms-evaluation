package org.jsoup.nodes;

public class GeneratedToStringIsCorrect {

    @Test
    public void toStringIsCorrect() throws IOException {
        Comment comment = new Comment("This is a test comment.");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        when(out.prettyPrint()).thenReturn(true);
        when(document.body()).thenReturn(mock(Element.class));

        comment.outerHtml(accum, 0, out); // Trigger outerHtml
        verify(accum).append("<!--This is a test comment.-->");
    }

}