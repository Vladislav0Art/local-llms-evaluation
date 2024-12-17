package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;

public class GeneratedOuterHtmlHeadIsNotCalledWhenOutPrettyPrintsAndThisIsFirstChildButOuterHtmlShouldBeUsed {

    @Test
    public void outerHtmlHeadIsNotCalledWhenOutPrettyPrintsAndThisIsFirstChildButOuterHtmlShouldBeUsed() throws Exception {
        Document document = new Document("html", null, "UTF-8");
        Comment comment = new Comment("Hello World!");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        outSettings.setUseOuterHtml(true);
        comment.outerHtmlHead(accum, depth, outSettings);
        assertFalse(accum.toString().contains("<!--"));
    }

}