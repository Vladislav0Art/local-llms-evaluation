package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedCommentToStringReturnsCorrectString {

    @Test
    public void commentToStringReturnsCorrectString() {
        // Stub the DocumentOutputSettings for testing purposes
        Document.OutputSettings expected = new Document.OutputSettings();
        expected.setEncoding("UTF-8");

        Comment comment = new Comment("");
        String actual = comment.toString();
        assertEquals(expected.getEncoding(), actual);
    }

}