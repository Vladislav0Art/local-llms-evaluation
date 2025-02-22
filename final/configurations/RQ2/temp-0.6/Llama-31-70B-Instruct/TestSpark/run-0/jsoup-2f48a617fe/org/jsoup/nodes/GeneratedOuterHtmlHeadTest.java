package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Hello World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlHead(builder, 0, new Document.OutputSettings());
        assertEquals("<!--Hello World!-->", builder.toString());
    }

}