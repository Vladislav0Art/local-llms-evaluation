package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest_withoutPrettyPrintAndNotFirstChildBlockElement {

    @Test
    public void outerHtmlHeadTest_withoutPrettyPrintAndNotFirstChildBlockElement() throws IOException {
        Document doc = new Document(new ParseSettings().prettyPrint(false));
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- Hello World! -->");
        comment.outerHtmlHead(accum, 0, doc.getOutputSettings());
        assertEquals("<!--Hello World!-->", accum.toString());
    }

}