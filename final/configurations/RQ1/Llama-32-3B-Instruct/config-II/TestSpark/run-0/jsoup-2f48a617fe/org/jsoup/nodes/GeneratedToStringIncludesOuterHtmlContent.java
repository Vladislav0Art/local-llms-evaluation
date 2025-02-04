package org.jsoup.nodes;

public class GeneratedToStringIncludesOuterHtmlContent {

    @Test
    public void toStringIncludesOuterHtmlContent() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Comment Data");
        String outerHtml = comment.toString();
        assertEquals("<!--Comment Data-->", outerHtml.substring(0, outerHtml.length() - 1));
    }

}