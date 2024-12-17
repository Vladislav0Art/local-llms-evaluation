package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        assertEquals("This is a test comment", comment.toString());
    }

}