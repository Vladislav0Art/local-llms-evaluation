package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailForEmptyCommentDoesNotAppendAnything {

    @Test
    public void outerHtmlTailForEmptyCommentDoesNotAppendAnything() {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("");
        comment.outerHtmlTail(appendable, 0, Document.OutputSettings.empty());
        assertEquals("", appendable.toString());
    }

}