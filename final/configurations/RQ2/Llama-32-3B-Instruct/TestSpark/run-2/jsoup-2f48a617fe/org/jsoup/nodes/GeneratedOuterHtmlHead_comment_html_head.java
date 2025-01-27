package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_comment_html_head {

    @Test
    public void outerHtmlHead_comment_html_head() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        outContent.write("<!--Comment:CommentData-->".getBytes());
        outContent.close();
        Comment comment = new Comment("CommentData");
        Appendable accum = new StringBuilder(outContent.toString());
        int depth = 1;
        Document.OutputSettings out = null;
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--Comment:CommentData-->", accum.toString());
    }

}