package org.jsoup.nodes;

public class GeneratedOuterHtmlShouldReturnCorrectString {

    @Test
    public void outerHtmlShouldReturnCorrectString() throws IOException {
        Comment comment = new Comment("Hello World");
        String expectedOutput = "<!--Hello World-->";
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Document document = mock(Document.class);
        int depth = 0;
        comment.outerHtml(accum, depth, out);
        assertEquals(expectedOutput, comment.toString());
    }

}