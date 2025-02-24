package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHead_ReturnsCorrectValue {

    @Test
    public void outerHtmlHead_ReturnsCorrectValue() {
        Comment comment = new Comment("This is a comment");
        StringBuilder expected = new StringBuilder();
        expected.append("<!--This is a comment-->");
        assertEquals(expected.toString(), comment.outerHtmlHead(new StringBuilder(), 0, new Document.OutputSettings()));
    }

}