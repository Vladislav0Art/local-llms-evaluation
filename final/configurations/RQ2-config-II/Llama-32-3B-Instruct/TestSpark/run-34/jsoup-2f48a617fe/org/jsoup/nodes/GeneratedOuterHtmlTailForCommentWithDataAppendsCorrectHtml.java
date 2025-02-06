package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailForCommentWithDataAppendsCorrectHtml {

    @Test
    public void outerHtmlTailForCommentWithDataAppendsCorrectHtml() {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlTail(appendable, 0, Document.OutputSettings.empty());
        assertEquals("<br>", appendable.toString());
    }

}