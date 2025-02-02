package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadWithComment {

    @Test
    public void outerHtmlHeadWithComment() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 10, "Hello World!");
            assertEquals(17, accum.length());
            assertTrue(accum.toString().contains("<!--"));
            assertTrue(accum.toString().contains("This is a comment"));
            assertTrue(accum.toString().contains("Hello World!"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

class Comment {
    public String getData() {
        return "";
    }

    public void setData(String data) {
    }

    public void outerHtmlHead(Appendable accum, int offset, String text) throws IOException {
    }

}