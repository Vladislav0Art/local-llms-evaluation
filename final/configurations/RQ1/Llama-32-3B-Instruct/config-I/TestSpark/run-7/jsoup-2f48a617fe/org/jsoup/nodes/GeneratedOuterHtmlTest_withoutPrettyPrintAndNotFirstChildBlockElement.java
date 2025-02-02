package org.jsoup.nodes;

public class GeneratedOuterHtmlTest_withoutPrettyPrintAndNotFirstChildBlockElement {

    @Test
    public void outerHtmlTest_withoutPrettyPrintAndNotFirstChildBlockElement() throws IOException {
        Document doc = new Document(new ParseSettings().prettyPrint(false));
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- Hello World! -->");
        comment.outerHtml(accum, 0, doc.getOutputSettings());
        assertEquals("<!--Hello World!-->", accum.toString());
    }

}