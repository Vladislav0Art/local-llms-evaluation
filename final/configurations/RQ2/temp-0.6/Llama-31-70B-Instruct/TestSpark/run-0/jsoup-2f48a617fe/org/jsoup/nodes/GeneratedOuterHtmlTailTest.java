package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Hello World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, new Document.OutputSettings());
        assertEquals("", builder.toString());
    }

}