package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest_withPrettyPrintTrue_andFirstChildIsBlockElement {

    @Test
    public void outerHtmlHeadTest_withPrettyPrintTrue_andFirstChildIsBlockElement() throws IOException {
        Document doc = new Document(new ParseSettings().prettyPrint(true));
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- Hello World! -->");
        comment.outerHtmlHead(accum, 0, doc.getOutputSettings());
        assertEquals("<!--Hello World!-->", accum.toString());
    }

}