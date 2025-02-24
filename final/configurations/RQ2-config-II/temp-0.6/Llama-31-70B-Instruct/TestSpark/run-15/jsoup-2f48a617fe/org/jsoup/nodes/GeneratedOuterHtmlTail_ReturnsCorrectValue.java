package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTail_ReturnsCorrectValue {

    @Test
    public void outerHtmlTail_ReturnsCorrectValue() {
        Comment comment = new Comment("This is a comment");
        StringBuilder expected = new StringBuilder();
        expected.append("<!--This is a comment-->");
        assertEquals(expected.toString(), comment.outerHtmlTail(new StringBuilder(), 0, new Document.OutputSettings()));
    }

}