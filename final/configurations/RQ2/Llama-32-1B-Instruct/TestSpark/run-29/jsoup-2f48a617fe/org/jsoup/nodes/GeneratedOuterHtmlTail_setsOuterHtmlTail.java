package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;

public class GeneratedOuterHtmlTail_setsOuterHtmlTail {

    private Document document;

    @Before
    public void setup() throws Exception {
        Parser parser = new Parser();
        ParseSettings parseSettings = parser.getSettings();
        parseSettings.setFormMode(Parser.FORM_MODE_COMMENT);
        document = new Document("comment.html", parseSettings, parser);
    }

    @Test
    public void outerHtmlTail_setsOuterHtmlTail() throws Exception {
        Comment comment = new Comment("Initial comment");
        comment.outerHtmlTail(document, 0, document.OutputSettings());
        Assert.assertEquals("<comment></comment>", comment.outerHtml());
    }

}