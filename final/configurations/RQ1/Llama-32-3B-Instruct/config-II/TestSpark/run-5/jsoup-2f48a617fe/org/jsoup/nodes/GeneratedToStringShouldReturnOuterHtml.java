package org.jsoup.nodes;

public class GeneratedToStringShouldReturnOuterHtml {

    private Comment comment;

    @Test
    public void toStringShouldReturnOuterHtml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        comment.outerHtmlHead(accum, 0, out);
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("<!--New data-->", comment.toString());
    }

}