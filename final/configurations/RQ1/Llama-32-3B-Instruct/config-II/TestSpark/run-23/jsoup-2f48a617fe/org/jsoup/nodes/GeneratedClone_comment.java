package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_comment {

    @Test
    public void clone_comment() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

}