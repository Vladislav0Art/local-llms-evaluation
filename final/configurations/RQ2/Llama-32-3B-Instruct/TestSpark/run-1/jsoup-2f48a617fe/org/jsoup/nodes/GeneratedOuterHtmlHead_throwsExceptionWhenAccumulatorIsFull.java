package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHead_throwsExceptionWhenAccumulatorIsFull {

    @Test
    public void outerHtmlHead_throwsExceptionWhenAccumulatorIsFull() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        try {
            comment.outerHtmlHead(bos, 0, out);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }

}