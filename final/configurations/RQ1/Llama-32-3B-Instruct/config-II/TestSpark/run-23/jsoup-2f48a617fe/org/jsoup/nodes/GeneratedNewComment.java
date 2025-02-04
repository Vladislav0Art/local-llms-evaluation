package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewComment {

    @Test
    public void newComment() {
        Comment comment = new Comment("This is a test");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a test", comment.getData());
    }

}