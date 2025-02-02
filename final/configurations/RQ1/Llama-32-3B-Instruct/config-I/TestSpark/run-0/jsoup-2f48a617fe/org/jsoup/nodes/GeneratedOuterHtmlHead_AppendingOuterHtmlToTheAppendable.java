package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AppendingOuterHtmlToTheAppendable {

    @Test
    public void OuterHtmlHead_AppendingOuterHtmlToTheAppendable() throws IOException {
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment("");
        Document.OutputSettings out = new Document.OutputSettings(false);
        comment.outerHtmlHead(appendable, 0, out);
        assertTrue(appendable.toString().contains("<!--"));
        assertTrue(appendable.toString().endsWith("-->"));
    }

}