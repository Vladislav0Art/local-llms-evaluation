package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadShouldIncludeCommentData {

    @Test
    public void outerHtmlHeadShouldIncludeCommentData() {
        Comment comment = new Comment("This is a test");
        Document document = new Document();
        Appendable appendable = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(appendable, depth, out);
        assertEquals("<!-- This is a test -->", appendable.toString());
    }

}