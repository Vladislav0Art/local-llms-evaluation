package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void newCommentConstructWithData() {
        try {
            Comment comment = new Comment("<!-- This is a comment -->");
            assertEquals(comment.getData(), "<!-- This is a comment -->");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void setDataOnComment() {
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.setData("New comment content");
            assertEquals(comment.getData(), "New comment content");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void outerHtmlHeadAppendTagForComment() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 0, out);
            assertTrue(accum.toString().contains("<!--"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void outerHtmlHeadAppendDataAsCommentText() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 0, out);
            assertTrue(accum.toString().contains(comment.getData()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void outerHtmlTailNoOp() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void outerHtmlHeadWithText() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 10, "Hello World!");
            assertEquals(11, accum.length());
            assertTrue(accum.toString().contains("<!--"));
            assertTrue(accum.toString().contains("Hello World!"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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