package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadForCommentWithDataAppendsCorrectHtml {

    @Test
    public void outerHtmlHeadForCommentWithDataAppendsCorrectHtml() throws IOException {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlHead(appendable, 0, Document.OutputSettings.empty());
        assertEquals("<p>Hello World</p>", appendable.toString());
    }

}