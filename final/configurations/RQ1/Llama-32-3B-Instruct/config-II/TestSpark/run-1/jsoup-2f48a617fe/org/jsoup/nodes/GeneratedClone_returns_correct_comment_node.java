package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_returns_correct_comment_node {

    @Test
    public void clone_returns_correct_comment_node() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertEquals("This is a comment", clonedComment.getData());
    }

}