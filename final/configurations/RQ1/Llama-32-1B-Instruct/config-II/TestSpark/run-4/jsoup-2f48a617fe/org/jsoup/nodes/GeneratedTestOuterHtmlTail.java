package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        Document outputSettings = new Document.OutputSettings().prettyPrint(true).outline(false);
        Comment comment = new Comment("#comment");
        comment.outerHtmlHead(accum, 0, outputSettings);
        comment.outerHtmlTail(accum, 0, outputSettings);
    }

}