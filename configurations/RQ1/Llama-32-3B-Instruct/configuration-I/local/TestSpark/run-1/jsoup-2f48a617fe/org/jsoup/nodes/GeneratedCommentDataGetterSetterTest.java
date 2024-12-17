package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCommentDataGetterSetterTest {

    @Test
    public void CommentDataGetterSetterTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
        comment.setData("Another comment");
        assertEquals("Another comment", comment.getData());
    }

    public void testOuterHtmlHead throws

    IOException {
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();

        // Mock implementation for outerHtmlHead
        Accumulator accumulator = new Accumulator(accum);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accumulator, 0, out);

        assertEquals("<!-- comment -->", accum.toString());
    }

    public void testOuterHtmlTail throws

    IOException {
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();

        // Mock implementation for outerHtmlTail
        Appendable appendable = new Appendable() {
            @Override
            public String toString() {
                return "";
            }
        };
        Comment comment = new Comment("");
        comment.outerHtmlTail(appendable, 0, out);

        assertEquals("", accum.toString());
    }

}