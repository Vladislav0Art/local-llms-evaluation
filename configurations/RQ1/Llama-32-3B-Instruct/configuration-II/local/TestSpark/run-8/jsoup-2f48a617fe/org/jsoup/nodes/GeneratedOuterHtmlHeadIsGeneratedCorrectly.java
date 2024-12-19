package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIsGeneratedCorrectly {

    @Test
    public void outerHtmlHeadIsGeneratedCorrectly() throws IOException {
        Comment comment = new Comment("This is a test comment.");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Document document = mock(Document.class);
        Element element = mock(Element.class);

        when(document.body()).thenReturn(element);
        when(element.children()).thenReturn(Collections.singletonList(comment));

        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append("<!--This is a test comment.-->");
    }

}