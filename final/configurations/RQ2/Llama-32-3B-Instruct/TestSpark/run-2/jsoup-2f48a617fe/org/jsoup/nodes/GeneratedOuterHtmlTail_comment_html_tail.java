package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_comment_html_tail {

    @Test
    public void outerHtmlTail_comment_html_tail() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        outContent.write("<!--Comment:CommentData-->".getBytes());
        outContent.close();
        Comment comment = new Comment("CommentData");
        Appendable accum = new StringBuilder(outContent.toString());
        int depth = 1;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("<!--Comment:CommentData-->", accum.toString());
    }

}