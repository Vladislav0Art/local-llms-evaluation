package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--This is a comment-->", outContent.toString().trim());
    }

}