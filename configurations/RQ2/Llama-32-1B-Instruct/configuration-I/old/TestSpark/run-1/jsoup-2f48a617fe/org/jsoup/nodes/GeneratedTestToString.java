package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Document document = new Document();
        comment = new Comment(document);
        assertNotNull(comment.toString());
        String strComment = comment.toString();
        assertEquals("This is a sample comment", strComment);
    }

}