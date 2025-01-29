package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTail_AppendsCommentNodeToOutput {

    @Test
    public void outerHtmlTail_AppendsCommentNodeToOutput() throws IOException {
        Comment comment = new Comment("This is a test comment");
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = new Parser(parseSettings);
        Document document = new Document();
        document.appendChild(comment.outerHtmlTail(parser, 0, document.getOutputSettings()));
        Assert.assertEquals(1, document.getDocumentNode().getElementsByTagNameNS("http://www.w3.org/1999/xhtml", "comment").length);
    }

}