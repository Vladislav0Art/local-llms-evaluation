package org.jsoup.nodes;

public class GeneratedOuterHtmlTest_withPrettyPrintAndFirstChildIsBlockElement {

    @Test
    public void outerHtmlTest_withPrettyPrintAndFirstChildIsBlockElement() throws IOException {
        Document doc = new Document(new ParseSettings().prettyPrint(true));
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- Hello World! -->");
        comment.outerHtml(accum, 0, doc.getOutputSettings());
        assertEquals("<!--Hello World!-->", accum.toString());
    }

}